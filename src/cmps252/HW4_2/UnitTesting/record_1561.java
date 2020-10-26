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
class Record_1561 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1561: FirstName is Gerardo")
	void FirstNameOfRecord1561() {
		assertEquals("Gerardo", customers.get(1560).getFirstName());
	}

	@Test
	@DisplayName("Record 1561: LastName is Bankemper")
	void LastNameOfRecord1561() {
		assertEquals("Bankemper", customers.get(1560).getLastName());
	}

	@Test
	@DisplayName("Record 1561: Company is Butcher Block Whol Meat Co")
	void CompanyOfRecord1561() {
		assertEquals("Butcher Block Whol Meat Co", customers.get(1560).getCompany());
	}

	@Test
	@DisplayName("Record 1561: Address is 2015 Carey Ave")
	void AddressOfRecord1561() {
		assertEquals("2015 Carey Ave", customers.get(1560).getAddress());
	}

	@Test
	@DisplayName("Record 1561: City is Cheyenne")
	void CityOfRecord1561() {
		assertEquals("Cheyenne", customers.get(1560).getCity());
	}

	@Test
	@DisplayName("Record 1561: County is Laramie")
	void CountyOfRecord1561() {
		assertEquals("Laramie", customers.get(1560).getCounty());
	}

	@Test
	@DisplayName("Record 1561: State is WY")
	void StateOfRecord1561() {
		assertEquals("WY", customers.get(1560).getState());
	}

	@Test
	@DisplayName("Record 1561: ZIP is 82001")
	void ZIPOfRecord1561() {
		assertEquals("82001", customers.get(1560).getZIP());
	}

	@Test
	@DisplayName("Record 1561: Phone is 307-634-8250")
	void PhoneOfRecord1561() {
		assertEquals("307-634-8250", customers.get(1560).getPhone());
	}

	@Test
	@DisplayName("Record 1561: Fax is 307-634-9257")
	void FaxOfRecord1561() {
		assertEquals("307-634-9257", customers.get(1560).getFax());
	}

	@Test
	@DisplayName("Record 1561: Email is gerardo@bankemper.com")
	void EmailOfRecord1561() {
		assertEquals("gerardo@bankemper.com", customers.get(1560).getEmail());
	}

	@Test
	@DisplayName("Record 1561: Web is http://www.gerardobankemper.com")
	void WebOfRecord1561() {
		assertEquals("http://www.gerardobankemper.com", customers.get(1560).getWeb());
	}
}
