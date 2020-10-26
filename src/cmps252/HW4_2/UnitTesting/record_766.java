package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("33")
class Record_766 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 766: FirstName is Marisol")
	void FirstNameOfRecord766() {
		assertEquals("Marisol", customers.get(765).getFirstName());
	}

	@Test
	@DisplayName("Record 766: LastName is Mcmannus")
	void LastNameOfRecord766() {
		assertEquals("Mcmannus", customers.get(765).getLastName());
	}

	@Test
	@DisplayName("Record 766: Company is A American Custom Counter Tops")
	void CompanyOfRecord766() {
		assertEquals("A American Custom Counter Tops", customers.get(765).getCompany());
	}

	@Test
	@DisplayName("Record 766: Address is 3200 Red Lion Rd")
	void AddressOfRecord766() {
		assertEquals("3200 Red Lion Rd", customers.get(765).getAddress());
	}

	@Test
	@DisplayName("Record 766: City is Philadelphia")
	void CityOfRecord766() {
		assertEquals("Philadelphia", customers.get(765).getCity());
	}

	@Test
	@DisplayName("Record 766: County is Philadelphia")
	void CountyOfRecord766() {
		assertEquals("Philadelphia", customers.get(765).getCounty());
	}

	@Test
	@DisplayName("Record 766: State is PA")
	void StateOfRecord766() {
		assertEquals("PA", customers.get(765).getState());
	}

	@Test
	@DisplayName("Record 766: ZIP is 19114")
	void ZIPOfRecord766() {
		assertEquals("19114", customers.get(765).getZIP());
	}

	@Test
	@DisplayName("Record 766: Phone is 215-632-6080")
	void PhoneOfRecord766() {
		assertEquals("215-632-6080", customers.get(765).getPhone());
	}

	@Test
	@DisplayName("Record 766: Fax is 215-632-7288")
	void FaxOfRecord766() {
		assertEquals("215-632-7288", customers.get(765).getFax());
	}

	@Test
	@DisplayName("Record 766: Email is marisol@mcmannus.com")
	void EmailOfRecord766() {
		assertEquals("marisol@mcmannus.com", customers.get(765).getEmail());
	}

	@Test
	@DisplayName("Record 766: Web is http://www.marisolmcmannus.com")
	void WebOfRecord766() {
		assertEquals("http://www.marisolmcmannus.com", customers.get(765).getWeb());
	}
}
