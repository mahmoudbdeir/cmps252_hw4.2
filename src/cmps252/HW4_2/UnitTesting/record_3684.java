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

@Tag("32")
class Record_3684 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3684: FirstName is Tessa")
	void FirstNameOfRecord3684() {
		assertEquals("Tessa", customers.get(3683).getFirstName());
	}

	@Test
	@DisplayName("Record 3684: LastName is Hoeffer")
	void LastNameOfRecord3684() {
		assertEquals("Hoeffer", customers.get(3683).getLastName());
	}

	@Test
	@DisplayName("Record 3684: Company is Nassau Drive Shafts Inc")
	void CompanyOfRecord3684() {
		assertEquals("Nassau Drive Shafts Inc", customers.get(3683).getCompany());
	}

	@Test
	@DisplayName("Record 3684: Address is 1245 W Fremont St")
	void AddressOfRecord3684() {
		assertEquals("1245 W Fremont St", customers.get(3683).getAddress());
	}

	@Test
	@DisplayName("Record 3684: City is Stockton")
	void CityOfRecord3684() {
		assertEquals("Stockton", customers.get(3683).getCity());
	}

	@Test
	@DisplayName("Record 3684: County is San Joaquin")
	void CountyOfRecord3684() {
		assertEquals("San Joaquin", customers.get(3683).getCounty());
	}

	@Test
	@DisplayName("Record 3684: State is CA")
	void StateOfRecord3684() {
		assertEquals("CA", customers.get(3683).getState());
	}

	@Test
	@DisplayName("Record 3684: ZIP is 95203")
	void ZIPOfRecord3684() {
		assertEquals("95203", customers.get(3683).getZIP());
	}

	@Test
	@DisplayName("Record 3684: Phone is 209-462-0929")
	void PhoneOfRecord3684() {
		assertEquals("209-462-0929", customers.get(3683).getPhone());
	}

	@Test
	@DisplayName("Record 3684: Fax is 209-462-7824")
	void FaxOfRecord3684() {
		assertEquals("209-462-7824", customers.get(3683).getFax());
	}

	@Test
	@DisplayName("Record 3684: Email is tessa@hoeffer.com")
	void EmailOfRecord3684() {
		assertEquals("tessa@hoeffer.com", customers.get(3683).getEmail());
	}

	@Test
	@DisplayName("Record 3684: Web is http://www.tessahoeffer.com")
	void WebOfRecord3684() {
		assertEquals("http://www.tessahoeffer.com", customers.get(3683).getWeb());
	}
}
