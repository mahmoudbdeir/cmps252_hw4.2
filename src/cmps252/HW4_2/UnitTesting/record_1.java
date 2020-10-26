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

@Tag("35")
class Record_1 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1: FirstName is Portia")
	void FirstNameOfRecord1() {
		assertEquals("Portia", customers.get(0).getFirstName());
	}

	@Test
	@DisplayName("Record 1: LastName is Mcfann")
	void LastNameOfRecord1() {
		assertEquals("Mcfann", customers.get(0).getLastName());
	}

	@Test
	@DisplayName("Record 1: Company is Beachcomber Realty")
	void CompanyOfRecord1() {
		assertEquals("Beachcomber Realty", customers.get(0).getCompany());
	}

	@Test
	@DisplayName("Record 1: Address is 4891 Pacific Hwy")
	void AddressOfRecord1() {
		assertEquals("4891 Pacific Hwy", customers.get(0).getAddress());
	}

	@Test
	@DisplayName("Record 1: City is San Diego")
	void CityOfRecord1() {
		assertEquals("San Diego", customers.get(0).getCity());
	}

	@Test
	@DisplayName("Record 1: County is San Diego")
	void CountyOfRecord1() {
		assertEquals("San Diego", customers.get(0).getCounty());
	}

	@Test
	@DisplayName("Record 1: State is CA")
	void StateOfRecord1() {
		assertEquals("CA", customers.get(0).getState());
	}

	@Test
	@DisplayName("Record 1: ZIP is 92110")
	void ZIPOfRecord1() {
		assertEquals("92110", customers.get(0).getZIP());
	}

	@Test
	@DisplayName("Record 1: Phone is 858-294-0682")
	void PhoneOfRecord1() {
		assertEquals("858-294-0682", customers.get(0).getPhone());
	}

	@Test
	@DisplayName("Record 1: Fax is 858-294-1695")
	void FaxOfRecord1() {
		assertEquals("858-294-1695", customers.get(0).getFax());
	}

	@Test
	@DisplayName("Record 1: Email is portia@mcfann.com")
	void EmailOfRecord1() {
		assertEquals("portia@mcfann.com", customers.get(0).getEmail());
	}

	@Test
	@DisplayName("Record 1: Web is http://www.portiamcfann.com")
	void WebOfRecord1() {
		assertEquals("http://www.portiamcfann.com", customers.get(0).getWeb());
	}
}
