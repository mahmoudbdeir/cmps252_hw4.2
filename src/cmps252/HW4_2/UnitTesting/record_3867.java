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

@Tag("36")
class Record_3867 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3867: FirstName is Guillermo")
	void FirstNameOfRecord3867() {
		assertEquals("Guillermo", customers.get(3866).getFirstName());
	}

	@Test
	@DisplayName("Record 3867: LastName is Dizadare")
	void LastNameOfRecord3867() {
		assertEquals("Dizadare", customers.get(3866).getLastName());
	}

	@Test
	@DisplayName("Record 3867: Company is Bt Graphics")
	void CompanyOfRecord3867() {
		assertEquals("Bt Graphics", customers.get(3866).getCompany());
	}

	@Test
	@DisplayName("Record 3867: Address is 446 Blake St")
	void AddressOfRecord3867() {
		assertEquals("446 Blake St", customers.get(3866).getAddress());
	}

	@Test
	@DisplayName("Record 3867: City is New Haven")
	void CityOfRecord3867() {
		assertEquals("New Haven", customers.get(3866).getCity());
	}

	@Test
	@DisplayName("Record 3867: County is New Haven")
	void CountyOfRecord3867() {
		assertEquals("New Haven", customers.get(3866).getCounty());
	}

	@Test
	@DisplayName("Record 3867: State is CT")
	void StateOfRecord3867() {
		assertEquals("CT", customers.get(3866).getState());
	}

	@Test
	@DisplayName("Record 3867: ZIP is 6515")
	void ZIPOfRecord3867() {
		assertEquals("6515", customers.get(3866).getZIP());
	}

	@Test
	@DisplayName("Record 3867: Phone is 203-387-7390")
	void PhoneOfRecord3867() {
		assertEquals("203-387-7390", customers.get(3866).getPhone());
	}

	@Test
	@DisplayName("Record 3867: Fax is 203-387-2497")
	void FaxOfRecord3867() {
		assertEquals("203-387-2497", customers.get(3866).getFax());
	}

	@Test
	@DisplayName("Record 3867: Email is guillermo@dizadare.com")
	void EmailOfRecord3867() {
		assertEquals("guillermo@dizadare.com", customers.get(3866).getEmail());
	}

	@Test
	@DisplayName("Record 3867: Web is http://www.guillermodizadare.com")
	void WebOfRecord3867() {
		assertEquals("http://www.guillermodizadare.com", customers.get(3866).getWeb());
	}
}
