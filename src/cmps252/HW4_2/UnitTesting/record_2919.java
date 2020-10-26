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
class Record_2919 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2919: FirstName is Bianca")
	void FirstNameOfRecord2919() {
		assertEquals("Bianca", customers.get(2918).getFirstName());
	}

	@Test
	@DisplayName("Record 2919: LastName is Betthauser")
	void LastNameOfRecord2919() {
		assertEquals("Betthauser", customers.get(2918).getLastName());
	}

	@Test
	@DisplayName("Record 2919: Company is Flex A Bed Of Georgia")
	void CompanyOfRecord2919() {
		assertEquals("Flex A Bed Of Georgia", customers.get(2918).getCompany());
	}

	@Test
	@DisplayName("Record 2919: Address is 433 Canal St")
	void AddressOfRecord2919() {
		assertEquals("433 Canal St", customers.get(2918).getAddress());
	}

	@Test
	@DisplayName("Record 2919: City is New York")
	void CityOfRecord2919() {
		assertEquals("New York", customers.get(2918).getCity());
	}

	@Test
	@DisplayName("Record 2919: County is New York")
	void CountyOfRecord2919() {
		assertEquals("New York", customers.get(2918).getCounty());
	}

	@Test
	@DisplayName("Record 2919: State is NY")
	void StateOfRecord2919() {
		assertEquals("NY", customers.get(2918).getState());
	}

	@Test
	@DisplayName("Record 2919: ZIP is 10013")
	void ZIPOfRecord2919() {
		assertEquals("10013", customers.get(2918).getZIP());
	}

	@Test
	@DisplayName("Record 2919: Phone is 212-941-3795")
	void PhoneOfRecord2919() {
		assertEquals("212-941-3795", customers.get(2918).getPhone());
	}

	@Test
	@DisplayName("Record 2919: Fax is 212-941-1379")
	void FaxOfRecord2919() {
		assertEquals("212-941-1379", customers.get(2918).getFax());
	}

	@Test
	@DisplayName("Record 2919: Email is bianca@betthauser.com")
	void EmailOfRecord2919() {
		assertEquals("bianca@betthauser.com", customers.get(2918).getEmail());
	}

	@Test
	@DisplayName("Record 2919: Web is http://www.biancabetthauser.com")
	void WebOfRecord2919() {
		assertEquals("http://www.biancabetthauser.com", customers.get(2918).getWeb());
	}
}
