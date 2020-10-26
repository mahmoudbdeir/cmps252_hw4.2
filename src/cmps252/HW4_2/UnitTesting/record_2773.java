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

@Tag("45")
class Record_2773 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2773: FirstName is Shannon")
	void FirstNameOfRecord2773() {
		assertEquals("Shannon", customers.get(2772).getFirstName());
	}

	@Test
	@DisplayName("Record 2773: LastName is Lamberto")
	void LastNameOfRecord2773() {
		assertEquals("Lamberto", customers.get(2772).getLastName());
	}

	@Test
	@DisplayName("Record 2773: Company is C R Machine")
	void CompanyOfRecord2773() {
		assertEquals("C R Machine", customers.get(2772).getCompany());
	}

	@Test
	@DisplayName("Record 2773: Address is 46 Ralph St")
	void AddressOfRecord2773() {
		assertEquals("46 Ralph St", customers.get(2772).getAddress());
	}

	@Test
	@DisplayName("Record 2773: City is Belleville")
	void CityOfRecord2773() {
		assertEquals("Belleville", customers.get(2772).getCity());
	}

	@Test
	@DisplayName("Record 2773: County is Essex")
	void CountyOfRecord2773() {
		assertEquals("Essex", customers.get(2772).getCounty());
	}

	@Test
	@DisplayName("Record 2773: State is NJ")
	void StateOfRecord2773() {
		assertEquals("NJ", customers.get(2772).getState());
	}

	@Test
	@DisplayName("Record 2773: ZIP is 7109")
	void ZIPOfRecord2773() {
		assertEquals("7109", customers.get(2772).getZIP());
	}

	@Test
	@DisplayName("Record 2773: Phone is 973-751-1234")
	void PhoneOfRecord2773() {
		assertEquals("973-751-1234", customers.get(2772).getPhone());
	}

	@Test
	@DisplayName("Record 2773: Fax is 973-751-4873")
	void FaxOfRecord2773() {
		assertEquals("973-751-4873", customers.get(2772).getFax());
	}

	@Test
	@DisplayName("Record 2773: Email is shannon@lamberto.com")
	void EmailOfRecord2773() {
		assertEquals("shannon@lamberto.com", customers.get(2772).getEmail());
	}

	@Test
	@DisplayName("Record 2773: Web is http://www.shannonlamberto.com")
	void WebOfRecord2773() {
		assertEquals("http://www.shannonlamberto.com", customers.get(2772).getWeb());
	}
}
