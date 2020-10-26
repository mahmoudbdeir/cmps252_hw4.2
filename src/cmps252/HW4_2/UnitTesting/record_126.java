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

@Tag("26")
class Record_126 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 126: FirstName is Santiago")
	void FirstNameOfRecord126() {
		assertEquals("Santiago", customers.get(125).getFirstName());
	}

	@Test
	@DisplayName("Record 126: LastName is Kafka")
	void LastNameOfRecord126() {
		assertEquals("Kafka", customers.get(125).getLastName());
	}

	@Test
	@DisplayName("Record 126: Company is Garey, Michael J Esq")
	void CompanyOfRecord126() {
		assertEquals("Garey, Michael J Esq", customers.get(125).getCompany());
	}

	@Test
	@DisplayName("Record 126: Address is 215 White Horse Pike")
	void AddressOfRecord126() {
		assertEquals("215 White Horse Pike", customers.get(125).getAddress());
	}

	@Test
	@DisplayName("Record 126: City is Barrington")
	void CityOfRecord126() {
		assertEquals("Barrington", customers.get(125).getCity());
	}

	@Test
	@DisplayName("Record 126: County is Camden")
	void CountyOfRecord126() {
		assertEquals("Camden", customers.get(125).getCounty());
	}

	@Test
	@DisplayName("Record 126: State is NJ")
	void StateOfRecord126() {
		assertEquals("NJ", customers.get(125).getState());
	}

	@Test
	@DisplayName("Record 126: ZIP is 8007")
	void ZIPOfRecord126() {
		assertEquals("8007", customers.get(125).getZIP());
	}

	@Test
	@DisplayName("Record 126: Phone is 856-547-2247")
	void PhoneOfRecord126() {
		assertEquals("856-547-2247", customers.get(125).getPhone());
	}

	@Test
	@DisplayName("Record 126: Fax is 856-547-3031")
	void FaxOfRecord126() {
		assertEquals("856-547-3031", customers.get(125).getFax());
	}

	@Test
	@DisplayName("Record 126: Email is santiago@kafka.com")
	void EmailOfRecord126() {
		assertEquals("santiago@kafka.com", customers.get(125).getEmail());
	}

	@Test
	@DisplayName("Record 126: Web is http://www.santiagokafka.com")
	void WebOfRecord126() {
		assertEquals("http://www.santiagokafka.com", customers.get(125).getWeb());
	}
}
