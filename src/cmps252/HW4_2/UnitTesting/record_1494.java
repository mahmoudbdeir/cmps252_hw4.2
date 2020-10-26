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

@Tag("14")
class Record_1494 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1494: FirstName is Alice")
	void FirstNameOfRecord1494() {
		assertEquals("Alice", customers.get(1493).getFirstName());
	}

	@Test
	@DisplayName("Record 1494: LastName is Adema")
	void LastNameOfRecord1494() {
		assertEquals("Adema", customers.get(1493).getLastName());
	}

	@Test
	@DisplayName("Record 1494: Company is Mcfall, Brad J Esq")
	void CompanyOfRecord1494() {
		assertEquals("Mcfall, Brad J Esq", customers.get(1493).getCompany());
	}

	@Test
	@DisplayName("Record 1494: Address is 3975 W Quail Ave  #-4")
	void AddressOfRecord1494() {
		assertEquals("3975 W Quail Ave  #-4", customers.get(1493).getAddress());
	}

	@Test
	@DisplayName("Record 1494: City is Las Vegas")
	void CityOfRecord1494() {
		assertEquals("Las Vegas", customers.get(1493).getCity());
	}

	@Test
	@DisplayName("Record 1494: County is Clark")
	void CountyOfRecord1494() {
		assertEquals("Clark", customers.get(1493).getCounty());
	}

	@Test
	@DisplayName("Record 1494: State is NV")
	void StateOfRecord1494() {
		assertEquals("NV", customers.get(1493).getState());
	}

	@Test
	@DisplayName("Record 1494: ZIP is 89118")
	void ZIPOfRecord1494() {
		assertEquals("89118", customers.get(1493).getZIP());
	}

	@Test
	@DisplayName("Record 1494: Phone is 702-798-8238")
	void PhoneOfRecord1494() {
		assertEquals("702-798-8238", customers.get(1493).getPhone());
	}

	@Test
	@DisplayName("Record 1494: Fax is 702-798-8675")
	void FaxOfRecord1494() {
		assertEquals("702-798-8675", customers.get(1493).getFax());
	}

	@Test
	@DisplayName("Record 1494: Email is alice@adema.com")
	void EmailOfRecord1494() {
		assertEquals("alice@adema.com", customers.get(1493).getEmail());
	}

	@Test
	@DisplayName("Record 1494: Web is http://www.aliceadema.com")
	void WebOfRecord1494() {
		assertEquals("http://www.aliceadema.com", customers.get(1493).getWeb());
	}
}
