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

@Tag("40")
class Record_2136 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2136: FirstName is Monty")
	void FirstNameOfRecord2136() {
		assertEquals("Monty", customers.get(2135).getFirstName());
	}

	@Test
	@DisplayName("Record 2136: LastName is Gerlach")
	void LastNameOfRecord2136() {
		assertEquals("Gerlach", customers.get(2135).getLastName());
	}

	@Test
	@DisplayName("Record 2136: Company is Mueller Cllg Holistic Studies")
	void CompanyOfRecord2136() {
		assertEquals("Mueller Cllg Holistic Studies", customers.get(2135).getCompany());
	}

	@Test
	@DisplayName("Record 2136: Address is 4600 S Mason Montgomery Rd")
	void AddressOfRecord2136() {
		assertEquals("4600 S Mason Montgomery Rd", customers.get(2135).getAddress());
	}

	@Test
	@DisplayName("Record 2136: City is Mason")
	void CityOfRecord2136() {
		assertEquals("Mason", customers.get(2135).getCity());
	}

	@Test
	@DisplayName("Record 2136: County is Warren")
	void CountyOfRecord2136() {
		assertEquals("Warren", customers.get(2135).getCounty());
	}

	@Test
	@DisplayName("Record 2136: State is OH")
	void StateOfRecord2136() {
		assertEquals("OH", customers.get(2135).getState());
	}

	@Test
	@DisplayName("Record 2136: ZIP is 45040")
	void ZIPOfRecord2136() {
		assertEquals("45040", customers.get(2135).getZIP());
	}

	@Test
	@DisplayName("Record 2136: Phone is 513-459-9915")
	void PhoneOfRecord2136() {
		assertEquals("513-459-9915", customers.get(2135).getPhone());
	}

	@Test
	@DisplayName("Record 2136: Fax is 513-459-6191")
	void FaxOfRecord2136() {
		assertEquals("513-459-6191", customers.get(2135).getFax());
	}

	@Test
	@DisplayName("Record 2136: Email is monty@gerlach.com")
	void EmailOfRecord2136() {
		assertEquals("monty@gerlach.com", customers.get(2135).getEmail());
	}

	@Test
	@DisplayName("Record 2136: Web is http://www.montygerlach.com")
	void WebOfRecord2136() {
		assertEquals("http://www.montygerlach.com", customers.get(2135).getWeb());
	}
}
