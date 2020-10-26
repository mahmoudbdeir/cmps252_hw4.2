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
class Record_1248 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1248: FirstName is Lauren")
	void FirstNameOfRecord1248() {
		assertEquals("Lauren", customers.get(1247).getFirstName());
	}

	@Test
	@DisplayName("Record 1248: LastName is Vanskike")
	void LastNameOfRecord1248() {
		assertEquals("Vanskike", customers.get(1247).getLastName());
	}

	@Test
	@DisplayName("Record 1248: Company is Hamersmith Inc")
	void CompanyOfRecord1248() {
		assertEquals("Hamersmith Inc", customers.get(1247).getCompany());
	}

	@Test
	@DisplayName("Record 1248: Address is 16875 Se 82nd Dr")
	void AddressOfRecord1248() {
		assertEquals("16875 Se 82nd Dr", customers.get(1247).getAddress());
	}

	@Test
	@DisplayName("Record 1248: City is Clackamas")
	void CityOfRecord1248() {
		assertEquals("Clackamas", customers.get(1247).getCity());
	}

	@Test
	@DisplayName("Record 1248: County is Clackamas")
	void CountyOfRecord1248() {
		assertEquals("Clackamas", customers.get(1247).getCounty());
	}

	@Test
	@DisplayName("Record 1248: State is OR")
	void StateOfRecord1248() {
		assertEquals("OR", customers.get(1247).getState());
	}

	@Test
	@DisplayName("Record 1248: ZIP is 97015")
	void ZIPOfRecord1248() {
		assertEquals("97015", customers.get(1247).getZIP());
	}

	@Test
	@DisplayName("Record 1248: Phone is 503-656-6217")
	void PhoneOfRecord1248() {
		assertEquals("503-656-6217", customers.get(1247).getPhone());
	}

	@Test
	@DisplayName("Record 1248: Fax is 503-656-6366")
	void FaxOfRecord1248() {
		assertEquals("503-656-6366", customers.get(1247).getFax());
	}

	@Test
	@DisplayName("Record 1248: Email is lauren@vanskike.com")
	void EmailOfRecord1248() {
		assertEquals("lauren@vanskike.com", customers.get(1247).getEmail());
	}

	@Test
	@DisplayName("Record 1248: Web is http://www.laurenvanskike.com")
	void WebOfRecord1248() {
		assertEquals("http://www.laurenvanskike.com", customers.get(1247).getWeb());
	}
}
