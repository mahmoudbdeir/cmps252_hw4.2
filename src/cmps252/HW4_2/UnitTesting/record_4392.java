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

@Tag("49")
class Record_4392 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4392: FirstName is Elma")
	void FirstNameOfRecord4392() {
		assertEquals("Elma", customers.get(4391).getFirstName());
	}

	@Test
	@DisplayName("Record 4392: LastName is Arrequin")
	void LastNameOfRecord4392() {
		assertEquals("Arrequin", customers.get(4391).getLastName());
	}

	@Test
	@DisplayName("Record 4392: Company is Avalon Hotel")
	void CompanyOfRecord4392() {
		assertEquals("Avalon Hotel", customers.get(4391).getCompany());
	}

	@Test
	@DisplayName("Record 4392: Address is 13600 Ne 126th Pl")
	void AddressOfRecord4392() {
		assertEquals("13600 Ne 126th Pl", customers.get(4391).getAddress());
	}

	@Test
	@DisplayName("Record 4392: City is Kirkland")
	void CityOfRecord4392() {
		assertEquals("Kirkland", customers.get(4391).getCity());
	}

	@Test
	@DisplayName("Record 4392: County is King")
	void CountyOfRecord4392() {
		assertEquals("King", customers.get(4391).getCounty());
	}

	@Test
	@DisplayName("Record 4392: State is WA")
	void StateOfRecord4392() {
		assertEquals("WA", customers.get(4391).getState());
	}

	@Test
	@DisplayName("Record 4392: ZIP is 98034")
	void ZIPOfRecord4392() {
		assertEquals("98034", customers.get(4391).getZIP());
	}

	@Test
	@DisplayName("Record 4392: Phone is 425-820-2390")
	void PhoneOfRecord4392() {
		assertEquals("425-820-2390", customers.get(4391).getPhone());
	}

	@Test
	@DisplayName("Record 4392: Fax is 425-820-6866")
	void FaxOfRecord4392() {
		assertEquals("425-820-6866", customers.get(4391).getFax());
	}

	@Test
	@DisplayName("Record 4392: Email is elma@arrequin.com")
	void EmailOfRecord4392() {
		assertEquals("elma@arrequin.com", customers.get(4391).getEmail());
	}

	@Test
	@DisplayName("Record 4392: Web is http://www.elmaarrequin.com")
	void WebOfRecord4392() {
		assertEquals("http://www.elmaarrequin.com", customers.get(4391).getWeb());
	}
}
