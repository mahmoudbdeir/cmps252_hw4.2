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
class Record_173 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 173: FirstName is Leeann")
	void FirstNameOfRecord173() {
		assertEquals("Leeann", customers.get(172).getFirstName());
	}

	@Test
	@DisplayName("Record 173: LastName is Miggo")
	void LastNameOfRecord173() {
		assertEquals("Miggo", customers.get(172).getLastName());
	}

	@Test
	@DisplayName("Record 173: Company is Shackelford, Randall W Esq")
	void CompanyOfRecord173() {
		assertEquals("Shackelford, Randall W Esq", customers.get(172).getCompany());
	}

	@Test
	@DisplayName("Record 173: Address is Box #-876")
	void AddressOfRecord173() {
		assertEquals("Box #-876", customers.get(172).getAddress());
	}

	@Test
	@DisplayName("Record 173: City is Rawlins")
	void CityOfRecord173() {
		assertEquals("Rawlins", customers.get(172).getCity());
	}

	@Test
	@DisplayName("Record 173: County is Carbon")
	void CountyOfRecord173() {
		assertEquals("Carbon", customers.get(172).getCounty());
	}

	@Test
	@DisplayName("Record 173: State is WY")
	void StateOfRecord173() {
		assertEquals("WY", customers.get(172).getState());
	}

	@Test
	@DisplayName("Record 173: ZIP is 82301")
	void ZIPOfRecord173() {
		assertEquals("82301", customers.get(172).getZIP());
	}

	@Test
	@DisplayName("Record 173: Phone is 307-324-1964")
	void PhoneOfRecord173() {
		assertEquals("307-324-1964", customers.get(172).getPhone());
	}

	@Test
	@DisplayName("Record 173: Fax is 307-324-6757")
	void FaxOfRecord173() {
		assertEquals("307-324-6757", customers.get(172).getFax());
	}

	@Test
	@DisplayName("Record 173: Email is leeann@miggo.com")
	void EmailOfRecord173() {
		assertEquals("leeann@miggo.com", customers.get(172).getEmail());
	}

	@Test
	@DisplayName("Record 173: Web is http://www.leeannmiggo.com")
	void WebOfRecord173() {
		assertEquals("http://www.leeannmiggo.com", customers.get(172).getWeb());
	}
}
