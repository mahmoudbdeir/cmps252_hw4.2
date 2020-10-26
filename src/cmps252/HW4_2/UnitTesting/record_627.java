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

@Tag("44")
class Record_627 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 627: FirstName is Larissa")
	void FirstNameOfRecord627() {
		assertEquals("Larissa", customers.get(626).getFirstName());
	}

	@Test
	@DisplayName("Record 627: LastName is Wachsman")
	void LastNameOfRecord627() {
		assertEquals("Wachsman", customers.get(626).getLastName());
	}

	@Test
	@DisplayName("Record 627: Company is Mozley, William")
	void CompanyOfRecord627() {
		assertEquals("Mozley, William", customers.get(626).getCompany());
	}

	@Test
	@DisplayName("Record 627: Address is 500 W 22nd St")
	void AddressOfRecord627() {
		assertEquals("500 W 22nd St", customers.get(626).getAddress());
	}

	@Test
	@DisplayName("Record 627: City is Anniston")
	void CityOfRecord627() {
		assertEquals("Anniston", customers.get(626).getCity());
	}

	@Test
	@DisplayName("Record 627: County is Calhoun")
	void CountyOfRecord627() {
		assertEquals("Calhoun", customers.get(626).getCounty());
	}

	@Test
	@DisplayName("Record 627: State is AL")
	void StateOfRecord627() {
		assertEquals("AL", customers.get(626).getState());
	}

	@Test
	@DisplayName("Record 627: ZIP is 36201")
	void ZIPOfRecord627() {
		assertEquals("36201", customers.get(626).getZIP());
	}

	@Test
	@DisplayName("Record 627: Phone is 256-237-2286")
	void PhoneOfRecord627() {
		assertEquals("256-237-2286", customers.get(626).getPhone());
	}

	@Test
	@DisplayName("Record 627: Fax is 256-237-0339")
	void FaxOfRecord627() {
		assertEquals("256-237-0339", customers.get(626).getFax());
	}

	@Test
	@DisplayName("Record 627: Email is larissa@wachsman.com")
	void EmailOfRecord627() {
		assertEquals("larissa@wachsman.com", customers.get(626).getEmail());
	}

	@Test
	@DisplayName("Record 627: Web is http://www.larissawachsman.com")
	void WebOfRecord627() {
		assertEquals("http://www.larissawachsman.com", customers.get(626).getWeb());
	}
}
