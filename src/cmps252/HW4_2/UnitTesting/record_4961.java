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
class Record_4961 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4961: FirstName is Allie")
	void FirstNameOfRecord4961() {
		assertEquals("Allie", customers.get(4960).getFirstName());
	}

	@Test
	@DisplayName("Record 4961: LastName is Konzen")
	void LastNameOfRecord4961() {
		assertEquals("Konzen", customers.get(4960).getLastName());
	}

	@Test
	@DisplayName("Record 4961: Company is Robbins, Virginia C Esq")
	void CompanyOfRecord4961() {
		assertEquals("Robbins, Virginia C Esq", customers.get(4960).getCompany());
	}

	@Test
	@DisplayName("Record 4961: Address is 1360 Palmetto Ave")
	void AddressOfRecord4961() {
		assertEquals("1360 Palmetto Ave", customers.get(4960).getAddress());
	}

	@Test
	@DisplayName("Record 4961: City is Winter Park")
	void CityOfRecord4961() {
		assertEquals("Winter Park", customers.get(4960).getCity());
	}

	@Test
	@DisplayName("Record 4961: County is Orange")
	void CountyOfRecord4961() {
		assertEquals("Orange", customers.get(4960).getCounty());
	}

	@Test
	@DisplayName("Record 4961: State is FL")
	void StateOfRecord4961() {
		assertEquals("FL", customers.get(4960).getState());
	}

	@Test
	@DisplayName("Record 4961: ZIP is 32789")
	void ZIPOfRecord4961() {
		assertEquals("32789", customers.get(4960).getZIP());
	}

	@Test
	@DisplayName("Record 4961: Phone is 407-628-4264")
	void PhoneOfRecord4961() {
		assertEquals("407-628-4264", customers.get(4960).getPhone());
	}

	@Test
	@DisplayName("Record 4961: Fax is 407-628-5445")
	void FaxOfRecord4961() {
		assertEquals("407-628-5445", customers.get(4960).getFax());
	}

	@Test
	@DisplayName("Record 4961: Email is allie@konzen.com")
	void EmailOfRecord4961() {
		assertEquals("allie@konzen.com", customers.get(4960).getEmail());
	}

	@Test
	@DisplayName("Record 4961: Web is http://www.alliekonzen.com")
	void WebOfRecord4961() {
		assertEquals("http://www.alliekonzen.com", customers.get(4960).getWeb());
	}
}
