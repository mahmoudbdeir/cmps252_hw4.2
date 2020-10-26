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
class Record_167 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 167: FirstName is Norma")
	void FirstNameOfRecord167() {
		assertEquals("Norma", customers.get(166).getFirstName());
	}

	@Test
	@DisplayName("Record 167: LastName is Lazusky")
	void LastNameOfRecord167() {
		assertEquals("Lazusky", customers.get(166).getLastName());
	}

	@Test
	@DisplayName("Record 167: Company is Provan Ind")
	void CompanyOfRecord167() {
		assertEquals("Provan Ind", customers.get(166).getCompany());
	}

	@Test
	@DisplayName("Record 167: Address is W Expw  #-83")
	void AddressOfRecord167() {
		assertEquals("W Expw  #-83", customers.get(166).getAddress());
	}

	@Test
	@DisplayName("Record 167: City is Mission")
	void CityOfRecord167() {
		assertEquals("Mission", customers.get(166).getCity());
	}

	@Test
	@DisplayName("Record 167: County is Hidalgo")
	void CountyOfRecord167() {
		assertEquals("Hidalgo", customers.get(166).getCounty());
	}

	@Test
	@DisplayName("Record 167: State is TX")
	void StateOfRecord167() {
		assertEquals("TX", customers.get(166).getState());
	}

	@Test
	@DisplayName("Record 167: ZIP is 78572")
	void ZIPOfRecord167() {
		assertEquals("78572", customers.get(166).getZIP());
	}

	@Test
	@DisplayName("Record 167: Phone is 956-581-4582")
	void PhoneOfRecord167() {
		assertEquals("956-581-4582", customers.get(166).getPhone());
	}

	@Test
	@DisplayName("Record 167: Fax is 956-581-7646")
	void FaxOfRecord167() {
		assertEquals("956-581-7646", customers.get(166).getFax());
	}

	@Test
	@DisplayName("Record 167: Email is norma@lazusky.com")
	void EmailOfRecord167() {
		assertEquals("norma@lazusky.com", customers.get(166).getEmail());
	}

	@Test
	@DisplayName("Record 167: Web is http://www.normalazusky.com")
	void WebOfRecord167() {
		assertEquals("http://www.normalazusky.com", customers.get(166).getWeb());
	}
}
