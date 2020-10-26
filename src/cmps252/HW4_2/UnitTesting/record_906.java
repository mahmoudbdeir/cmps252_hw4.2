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

@Tag("44")
class Record_906 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 906: FirstName is Horacio")
	void FirstNameOfRecord906() {
		assertEquals("Horacio", customers.get(905).getFirstName());
	}

	@Test
	@DisplayName("Record 906: LastName is Rellihan")
	void LastNameOfRecord906() {
		assertEquals("Rellihan", customers.get(905).getLastName());
	}

	@Test
	@DisplayName("Record 906: Company is Andrews Sanchez Amigone")
	void CompanyOfRecord906() {
		assertEquals("Andrews Sanchez Amigone", customers.get(905).getCompany());
	}

	@Test
	@DisplayName("Record 906: Address is 654 Rahway Ave")
	void AddressOfRecord906() {
		assertEquals("654 Rahway Ave", customers.get(905).getAddress());
	}

	@Test
	@DisplayName("Record 906: City is Union")
	void CityOfRecord906() {
		assertEquals("Union", customers.get(905).getCity());
	}

	@Test
	@DisplayName("Record 906: County is Union")
	void CountyOfRecord906() {
		assertEquals("Union", customers.get(905).getCounty());
	}

	@Test
	@DisplayName("Record 906: State is NJ")
	void StateOfRecord906() {
		assertEquals("NJ", customers.get(905).getState());
	}

	@Test
	@DisplayName("Record 906: ZIP is 7083")
	void ZIPOfRecord906() {
		assertEquals("7083", customers.get(905).getZIP());
	}

	@Test
	@DisplayName("Record 906: Phone is 908-851-7533")
	void PhoneOfRecord906() {
		assertEquals("908-851-7533", customers.get(905).getPhone());
	}

	@Test
	@DisplayName("Record 906: Fax is 908-851-0353")
	void FaxOfRecord906() {
		assertEquals("908-851-0353", customers.get(905).getFax());
	}

	@Test
	@DisplayName("Record 906: Email is horacio@rellihan.com")
	void EmailOfRecord906() {
		assertEquals("horacio@rellihan.com", customers.get(905).getEmail());
	}

	@Test
	@DisplayName("Record 906: Web is http://www.horaciorellihan.com")
	void WebOfRecord906() {
		assertEquals("http://www.horaciorellihan.com", customers.get(905).getWeb());
	}
}
