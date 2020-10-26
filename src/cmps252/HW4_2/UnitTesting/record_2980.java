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

@Tag("46")
class Record_2980 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2980: FirstName is Desmond")
	void FirstNameOfRecord2980() {
		assertEquals("Desmond", customers.get(2979).getFirstName());
	}

	@Test
	@DisplayName("Record 2980: LastName is Lantaff")
	void LastNameOfRecord2980() {
		assertEquals("Lantaff", customers.get(2979).getLastName());
	}

	@Test
	@DisplayName("Record 2980: Company is Corporate Training Center")
	void CompanyOfRecord2980() {
		assertEquals("Corporate Training Center", customers.get(2979).getCompany());
	}

	@Test
	@DisplayName("Record 2980: Address is 6398 Dougherty Rd  #-31")
	void AddressOfRecord2980() {
		assertEquals("6398 Dougherty Rd  #-31", customers.get(2979).getAddress());
	}

	@Test
	@DisplayName("Record 2980: City is Dublin")
	void CityOfRecord2980() {
		assertEquals("Dublin", customers.get(2979).getCity());
	}

	@Test
	@DisplayName("Record 2980: County is Alameda")
	void CountyOfRecord2980() {
		assertEquals("Alameda", customers.get(2979).getCounty());
	}

	@Test
	@DisplayName("Record 2980: State is CA")
	void StateOfRecord2980() {
		assertEquals("CA", customers.get(2979).getState());
	}

	@Test
	@DisplayName("Record 2980: ZIP is 94568")
	void ZIPOfRecord2980() {
		assertEquals("94568", customers.get(2979).getZIP());
	}

	@Test
	@DisplayName("Record 2980: Phone is 925-829-8744")
	void PhoneOfRecord2980() {
		assertEquals("925-829-8744", customers.get(2979).getPhone());
	}

	@Test
	@DisplayName("Record 2980: Fax is 925-829-1625")
	void FaxOfRecord2980() {
		assertEquals("925-829-1625", customers.get(2979).getFax());
	}

	@Test
	@DisplayName("Record 2980: Email is desmond@lantaff.com")
	void EmailOfRecord2980() {
		assertEquals("desmond@lantaff.com", customers.get(2979).getEmail());
	}

	@Test
	@DisplayName("Record 2980: Web is http://www.desmondlantaff.com")
	void WebOfRecord2980() {
		assertEquals("http://www.desmondlantaff.com", customers.get(2979).getWeb());
	}
}
