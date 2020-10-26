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

@Tag("22")
class Record_2288 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2288: FirstName is Erma")
	void FirstNameOfRecord2288() {
		assertEquals("Erma", customers.get(2287).getFirstName());
	}

	@Test
	@DisplayName("Record 2288: LastName is Chillis")
	void LastNameOfRecord2288() {
		assertEquals("Chillis", customers.get(2287).getLastName());
	}

	@Test
	@DisplayName("Record 2288: Company is Filmworks Usa Inc")
	void CompanyOfRecord2288() {
		assertEquals("Filmworks Usa Inc", customers.get(2287).getCompany());
	}

	@Test
	@DisplayName("Record 2288: Address is 2416 21st Ave S  #-208")
	void AddressOfRecord2288() {
		assertEquals("2416 21st Ave S  #-208", customers.get(2287).getAddress());
	}

	@Test
	@DisplayName("Record 2288: City is Nashville")
	void CityOfRecord2288() {
		assertEquals("Nashville", customers.get(2287).getCity());
	}

	@Test
	@DisplayName("Record 2288: County is Davidson")
	void CountyOfRecord2288() {
		assertEquals("Davidson", customers.get(2287).getCounty());
	}

	@Test
	@DisplayName("Record 2288: State is TN")
	void StateOfRecord2288() {
		assertEquals("TN", customers.get(2287).getState());
	}

	@Test
	@DisplayName("Record 2288: ZIP is 37212")
	void ZIPOfRecord2288() {
		assertEquals("37212", customers.get(2287).getZIP());
	}

	@Test
	@DisplayName("Record 2288: Phone is 615-385-8445")
	void PhoneOfRecord2288() {
		assertEquals("615-385-8445", customers.get(2287).getPhone());
	}

	@Test
	@DisplayName("Record 2288: Fax is 615-385-1186")
	void FaxOfRecord2288() {
		assertEquals("615-385-1186", customers.get(2287).getFax());
	}

	@Test
	@DisplayName("Record 2288: Email is erma@chillis.com")
	void EmailOfRecord2288() {
		assertEquals("erma@chillis.com", customers.get(2287).getEmail());
	}

	@Test
	@DisplayName("Record 2288: Web is http://www.ermachillis.com")
	void WebOfRecord2288() {
		assertEquals("http://www.ermachillis.com", customers.get(2287).getWeb());
	}
}
