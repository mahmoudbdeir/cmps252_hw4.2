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

@Tag("42")
class Record_4667 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4667: FirstName is Tracie")
	void FirstNameOfRecord4667() {
		assertEquals("Tracie", customers.get(4666).getFirstName());
	}

	@Test
	@DisplayName("Record 4667: LastName is Cohens")
	void LastNameOfRecord4667() {
		assertEquals("Cohens", customers.get(4666).getLastName());
	}

	@Test
	@DisplayName("Record 4667: Company is Markham, Gregory K Esq")
	void CompanyOfRecord4667() {
		assertEquals("Markham, Gregory K Esq", customers.get(4666).getCompany());
	}

	@Test
	@DisplayName("Record 4667: Address is 570 W Mount Pleasant Ave")
	void AddressOfRecord4667() {
		assertEquals("570 W Mount Pleasant Ave", customers.get(4666).getAddress());
	}

	@Test
	@DisplayName("Record 4667: City is Livingston")
	void CityOfRecord4667() {
		assertEquals("Livingston", customers.get(4666).getCity());
	}

	@Test
	@DisplayName("Record 4667: County is Essex")
	void CountyOfRecord4667() {
		assertEquals("Essex", customers.get(4666).getCounty());
	}

	@Test
	@DisplayName("Record 4667: State is NJ")
	void StateOfRecord4667() {
		assertEquals("NJ", customers.get(4666).getState());
	}

	@Test
	@DisplayName("Record 4667: ZIP is 7039")
	void ZIPOfRecord4667() {
		assertEquals("7039", customers.get(4666).getZIP());
	}

	@Test
	@DisplayName("Record 4667: Phone is 973-992-9156")
	void PhoneOfRecord4667() {
		assertEquals("973-992-9156", customers.get(4666).getPhone());
	}

	@Test
	@DisplayName("Record 4667: Fax is 973-992-2155")
	void FaxOfRecord4667() {
		assertEquals("973-992-2155", customers.get(4666).getFax());
	}

	@Test
	@DisplayName("Record 4667: Email is tracie@cohens.com")
	void EmailOfRecord4667() {
		assertEquals("tracie@cohens.com", customers.get(4666).getEmail());
	}

	@Test
	@DisplayName("Record 4667: Web is http://www.traciecohens.com")
	void WebOfRecord4667() {
		assertEquals("http://www.traciecohens.com", customers.get(4666).getWeb());
	}
}
