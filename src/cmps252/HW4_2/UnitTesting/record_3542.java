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

@Tag("0")
class Record_3542 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3542: FirstName is Andrew")
	void FirstNameOfRecord3542() {
		assertEquals("Andrew", customers.get(3541).getFirstName());
	}

	@Test
	@DisplayName("Record 3542: LastName is Stuczynski")
	void LastNameOfRecord3542() {
		assertEquals("Stuczynski", customers.get(3541).getLastName());
	}

	@Test
	@DisplayName("Record 3542: Company is Kralunas, Deborah H Esq")
	void CompanyOfRecord3542() {
		assertEquals("Kralunas, Deborah H Esq", customers.get(3541).getCompany());
	}

	@Test
	@DisplayName("Record 3542: Address is 889 High Ridge Rd")
	void AddressOfRecord3542() {
		assertEquals("889 High Ridge Rd", customers.get(3541).getAddress());
	}

	@Test
	@DisplayName("Record 3542: City is Stamford")
	void CityOfRecord3542() {
		assertEquals("Stamford", customers.get(3541).getCity());
	}

	@Test
	@DisplayName("Record 3542: County is Fairfield")
	void CountyOfRecord3542() {
		assertEquals("Fairfield", customers.get(3541).getCounty());
	}

	@Test
	@DisplayName("Record 3542: State is CT")
	void StateOfRecord3542() {
		assertEquals("CT", customers.get(3541).getState());
	}

	@Test
	@DisplayName("Record 3542: ZIP is 6905")
	void ZIPOfRecord3542() {
		assertEquals("6905", customers.get(3541).getZIP());
	}

	@Test
	@DisplayName("Record 3542: Phone is 203-968-1865")
	void PhoneOfRecord3542() {
		assertEquals("203-968-1865", customers.get(3541).getPhone());
	}

	@Test
	@DisplayName("Record 3542: Fax is 203-968-5096")
	void FaxOfRecord3542() {
		assertEquals("203-968-5096", customers.get(3541).getFax());
	}

	@Test
	@DisplayName("Record 3542: Email is andrew@stuczynski.com")
	void EmailOfRecord3542() {
		assertEquals("andrew@stuczynski.com", customers.get(3541).getEmail());
	}

	@Test
	@DisplayName("Record 3542: Web is http://www.andrewstuczynski.com")
	void WebOfRecord3542() {
		assertEquals("http://www.andrewstuczynski.com", customers.get(3541).getWeb());
	}
}
