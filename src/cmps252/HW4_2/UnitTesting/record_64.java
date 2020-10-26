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

@Tag("16")
class Record_64 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 64: FirstName is Vern")
	void FirstNameOfRecord64() {
		assertEquals("Vern", customers.get(63).getFirstName());
	}

	@Test
	@DisplayName("Record 64: LastName is Edmundson")
	void LastNameOfRecord64() {
		assertEquals("Edmundson", customers.get(63).getLastName());
	}

	@Test
	@DisplayName("Record 64: Company is Cpr Medical Mktng & Commctn")
	void CompanyOfRecord64() {
		assertEquals("Cpr Medical Mktng & Commctn", customers.get(63).getCompany());
	}

	@Test
	@DisplayName("Record 64: Address is 202 Edison Dr")
	void AddressOfRecord64() {
		assertEquals("202 Edison Dr", customers.get(63).getAddress());
	}

	@Test
	@DisplayName("Record 64: City is New Lenox")
	void CityOfRecord64() {
		assertEquals("New Lenox", customers.get(63).getCity());
	}

	@Test
	@DisplayName("Record 64: County is Will")
	void CountyOfRecord64() {
		assertEquals("Will", customers.get(63).getCounty());
	}

	@Test
	@DisplayName("Record 64: State is IL")
	void StateOfRecord64() {
		assertEquals("IL", customers.get(63).getState());
	}

	@Test
	@DisplayName("Record 64: ZIP is 60451")
	void ZIPOfRecord64() {
		assertEquals("60451", customers.get(63).getZIP());
	}

	@Test
	@DisplayName("Record 64: Phone is 815-485-4798")
	void PhoneOfRecord64() {
		assertEquals("815-485-4798", customers.get(63).getPhone());
	}

	@Test
	@DisplayName("Record 64: Fax is 815-485-1592")
	void FaxOfRecord64() {
		assertEquals("815-485-1592", customers.get(63).getFax());
	}

	@Test
	@DisplayName("Record 64: Email is vern@edmundson.com")
	void EmailOfRecord64() {
		assertEquals("vern@edmundson.com", customers.get(63).getEmail());
	}

	@Test
	@DisplayName("Record 64: Web is http://www.vernedmundson.com")
	void WebOfRecord64() {
		assertEquals("http://www.vernedmundson.com", customers.get(63).getWeb());
	}
}
