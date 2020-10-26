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

@Tag("4")
class Record_3996 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3996: FirstName is June")
	void FirstNameOfRecord3996() {
		assertEquals("June", customers.get(3995).getFirstName());
	}

	@Test
	@DisplayName("Record 3996: LastName is Dzurilla")
	void LastNameOfRecord3996() {
		assertEquals("Dzurilla", customers.get(3995).getLastName());
	}

	@Test
	@DisplayName("Record 3996: Company is Pokempner, Joseph K Esq")
	void CompanyOfRecord3996() {
		assertEquals("Pokempner, Joseph K Esq", customers.get(3995).getCompany());
	}

	@Test
	@DisplayName("Record 3996: Address is 476 Park Ave  #-226")
	void AddressOfRecord3996() {
		assertEquals("476 Park Ave  #-226", customers.get(3995).getAddress());
	}

	@Test
	@DisplayName("Record 3996: City is San Jose")
	void CityOfRecord3996() {
		assertEquals("San Jose", customers.get(3995).getCity());
	}

	@Test
	@DisplayName("Record 3996: County is Santa Clara")
	void CountyOfRecord3996() {
		assertEquals("Santa Clara", customers.get(3995).getCounty());
	}

	@Test
	@DisplayName("Record 3996: State is CA")
	void StateOfRecord3996() {
		assertEquals("CA", customers.get(3995).getState());
	}

	@Test
	@DisplayName("Record 3996: ZIP is 95110")
	void ZIPOfRecord3996() {
		assertEquals("95110", customers.get(3995).getZIP());
	}

	@Test
	@DisplayName("Record 3996: Phone is 408-446-4409")
	void PhoneOfRecord3996() {
		assertEquals("408-446-4409", customers.get(3995).getPhone());
	}

	@Test
	@DisplayName("Record 3996: Fax is 408-446-7502")
	void FaxOfRecord3996() {
		assertEquals("408-446-7502", customers.get(3995).getFax());
	}

	@Test
	@DisplayName("Record 3996: Email is june@dzurilla.com")
	void EmailOfRecord3996() {
		assertEquals("june@dzurilla.com", customers.get(3995).getEmail());
	}

	@Test
	@DisplayName("Record 3996: Web is http://www.junedzurilla.com")
	void WebOfRecord3996() {
		assertEquals("http://www.junedzurilla.com", customers.get(3995).getWeb());
	}
}
