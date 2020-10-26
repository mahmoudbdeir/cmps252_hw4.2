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
class Record_4433 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4433: FirstName is Claudette")
	void FirstNameOfRecord4433() {
		assertEquals("Claudette", customers.get(4432).getFirstName());
	}

	@Test
	@DisplayName("Record 4433: LastName is Essix")
	void LastNameOfRecord4433() {
		assertEquals("Essix", customers.get(4432).getLastName());
	}

	@Test
	@DisplayName("Record 4433: Company is Mc Hugh, Peter B Esq")
	void CompanyOfRecord4433() {
		assertEquals("Mc Hugh, Peter B Esq", customers.get(4432).getCompany());
	}

	@Test
	@DisplayName("Record 4433: Address is 1231 N Fork Hwy")
	void AddressOfRecord4433() {
		assertEquals("1231 N Fork Hwy", customers.get(4432).getAddress());
	}

	@Test
	@DisplayName("Record 4433: City is Cody")
	void CityOfRecord4433() {
		assertEquals("Cody", customers.get(4432).getCity());
	}

	@Test
	@DisplayName("Record 4433: County is Park")
	void CountyOfRecord4433() {
		assertEquals("Park", customers.get(4432).getCounty());
	}

	@Test
	@DisplayName("Record 4433: State is WY")
	void StateOfRecord4433() {
		assertEquals("WY", customers.get(4432).getState());
	}

	@Test
	@DisplayName("Record 4433: ZIP is 82414")
	void ZIPOfRecord4433() {
		assertEquals("82414", customers.get(4432).getZIP());
	}

	@Test
	@DisplayName("Record 4433: Phone is 307-587-4811")
	void PhoneOfRecord4433() {
		assertEquals("307-587-4811", customers.get(4432).getPhone());
	}

	@Test
	@DisplayName("Record 4433: Fax is 307-587-0261")
	void FaxOfRecord4433() {
		assertEquals("307-587-0261", customers.get(4432).getFax());
	}

	@Test
	@DisplayName("Record 4433: Email is claudette@essix.com")
	void EmailOfRecord4433() {
		assertEquals("claudette@essix.com", customers.get(4432).getEmail());
	}

	@Test
	@DisplayName("Record 4433: Web is http://www.claudetteessix.com")
	void WebOfRecord4433() {
		assertEquals("http://www.claudetteessix.com", customers.get(4432).getWeb());
	}
}
