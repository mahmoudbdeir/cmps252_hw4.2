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

@Tag("2")
class Record_539 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 539: FirstName is Hyman")
	void FirstNameOfRecord539() {
		assertEquals("Hyman", customers.get(538).getFirstName());
	}

	@Test
	@DisplayName("Record 539: LastName is Chin")
	void LastNameOfRecord539() {
		assertEquals("Chin", customers.get(538).getLastName());
	}

	@Test
	@DisplayName("Record 539: Company is Secretarial Services")
	void CompanyOfRecord539() {
		assertEquals("Secretarial Services", customers.get(538).getCompany());
	}

	@Test
	@DisplayName("Record 539: Address is 2321 N Hullen St")
	void AddressOfRecord539() {
		assertEquals("2321 N Hullen St", customers.get(538).getAddress());
	}

	@Test
	@DisplayName("Record 539: City is Metairie")
	void CityOfRecord539() {
		assertEquals("Metairie", customers.get(538).getCity());
	}

	@Test
	@DisplayName("Record 539: County is Jefferson")
	void CountyOfRecord539() {
		assertEquals("Jefferson", customers.get(538).getCounty());
	}

	@Test
	@DisplayName("Record 539: State is LA")
	void StateOfRecord539() {
		assertEquals("LA", customers.get(538).getState());
	}

	@Test
	@DisplayName("Record 539: ZIP is 70001")
	void ZIPOfRecord539() {
		assertEquals("70001", customers.get(538).getZIP());
	}

	@Test
	@DisplayName("Record 539: Phone is 504-834-6323")
	void PhoneOfRecord539() {
		assertEquals("504-834-6323", customers.get(538).getPhone());
	}

	@Test
	@DisplayName("Record 539: Fax is 504-834-8301")
	void FaxOfRecord539() {
		assertEquals("504-834-8301", customers.get(538).getFax());
	}

	@Test
	@DisplayName("Record 539: Email is hyman@chin.com")
	void EmailOfRecord539() {
		assertEquals("hyman@chin.com", customers.get(538).getEmail());
	}

	@Test
	@DisplayName("Record 539: Web is http://www.hymanchin.com")
	void WebOfRecord539() {
		assertEquals("http://www.hymanchin.com", customers.get(538).getWeb());
	}
}
