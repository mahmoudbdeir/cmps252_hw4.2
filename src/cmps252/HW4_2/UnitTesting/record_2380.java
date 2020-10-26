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

@Tag("19")
class Record_2380 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2380: FirstName is Kris")
	void FirstNameOfRecord2380() {
		assertEquals("Kris", customers.get(2379).getFirstName());
	}

	@Test
	@DisplayName("Record 2380: LastName is Santee")
	void LastNameOfRecord2380() {
		assertEquals("Santee", customers.get(2379).getLastName());
	}

	@Test
	@DisplayName("Record 2380: Company is La Vangie, Paul E")
	void CompanyOfRecord2380() {
		assertEquals("La Vangie, Paul E", customers.get(2379).getCompany());
	}

	@Test
	@DisplayName("Record 2380: Address is Box #-22129")
	void AddressOfRecord2380() {
		assertEquals("Box #-22129", customers.get(2379).getAddress());
	}

	@Test
	@DisplayName("Record 2380: City is San Francisco")
	void CityOfRecord2380() {
		assertEquals("San Francisco", customers.get(2379).getCity());
	}

	@Test
	@DisplayName("Record 2380: County is San Francisco")
	void CountyOfRecord2380() {
		assertEquals("San Francisco", customers.get(2379).getCounty());
	}

	@Test
	@DisplayName("Record 2380: State is CA")
	void StateOfRecord2380() {
		assertEquals("CA", customers.get(2379).getState());
	}

	@Test
	@DisplayName("Record 2380: ZIP is 94122")
	void ZIPOfRecord2380() {
		assertEquals("94122", customers.get(2379).getZIP());
	}

	@Test
	@DisplayName("Record 2380: Phone is 415-971-2360")
	void PhoneOfRecord2380() {
		assertEquals("415-971-2360", customers.get(2379).getPhone());
	}

	@Test
	@DisplayName("Record 2380: Fax is 415-971-1293")
	void FaxOfRecord2380() {
		assertEquals("415-971-1293", customers.get(2379).getFax());
	}

	@Test
	@DisplayName("Record 2380: Email is kris@santee.com")
	void EmailOfRecord2380() {
		assertEquals("kris@santee.com", customers.get(2379).getEmail());
	}

	@Test
	@DisplayName("Record 2380: Web is http://www.krissantee.com")
	void WebOfRecord2380() {
		assertEquals("http://www.krissantee.com", customers.get(2379).getWeb());
	}
}
