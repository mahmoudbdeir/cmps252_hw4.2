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

@Tag("8")
class Record_2191 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2191: FirstName is Jacinto")
	void FirstNameOfRecord2191() {
		assertEquals("Jacinto", customers.get(2190).getFirstName());
	}

	@Test
	@DisplayName("Record 2191: LastName is Yerbich")
	void LastNameOfRecord2191() {
		assertEquals("Yerbich", customers.get(2190).getLastName());
	}

	@Test
	@DisplayName("Record 2191: Company is Pip Printing")
	void CompanyOfRecord2191() {
		assertEquals("Pip Printing", customers.get(2190).getCompany());
	}

	@Test
	@DisplayName("Record 2191: Address is 950 Bloomfield Ave")
	void AddressOfRecord2191() {
		assertEquals("950 Bloomfield Ave", customers.get(2190).getAddress());
	}

	@Test
	@DisplayName("Record 2191: City is Caldwell")
	void CityOfRecord2191() {
		assertEquals("Caldwell", customers.get(2190).getCity());
	}

	@Test
	@DisplayName("Record 2191: County is Essex")
	void CountyOfRecord2191() {
		assertEquals("Essex", customers.get(2190).getCounty());
	}

	@Test
	@DisplayName("Record 2191: State is NJ")
	void StateOfRecord2191() {
		assertEquals("NJ", customers.get(2190).getState());
	}

	@Test
	@DisplayName("Record 2191: ZIP is 7006")
	void ZIPOfRecord2191() {
		assertEquals("7006", customers.get(2190).getZIP());
	}

	@Test
	@DisplayName("Record 2191: Phone is 973-575-1848")
	void PhoneOfRecord2191() {
		assertEquals("973-575-1848", customers.get(2190).getPhone());
	}

	@Test
	@DisplayName("Record 2191: Fax is 973-575-3396")
	void FaxOfRecord2191() {
		assertEquals("973-575-3396", customers.get(2190).getFax());
	}

	@Test
	@DisplayName("Record 2191: Email is jacinto@yerbich.com")
	void EmailOfRecord2191() {
		assertEquals("jacinto@yerbich.com", customers.get(2190).getEmail());
	}

	@Test
	@DisplayName("Record 2191: Web is http://www.jacintoyerbich.com")
	void WebOfRecord2191() {
		assertEquals("http://www.jacintoyerbich.com", customers.get(2190).getWeb());
	}
}
