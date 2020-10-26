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

@Tag("15")
class Record_3903 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3903: FirstName is Roderick")
	void FirstNameOfRecord3903() {
		assertEquals("Roderick", customers.get(3902).getFirstName());
	}

	@Test
	@DisplayName("Record 3903: LastName is Throneberry")
	void LastNameOfRecord3903() {
		assertEquals("Throneberry", customers.get(3902).getLastName());
	}

	@Test
	@DisplayName("Record 3903: Company is Northeast Steel Erectors Inc")
	void CompanyOfRecord3903() {
		assertEquals("Northeast Steel Erectors Inc", customers.get(3902).getCompany());
	}

	@Test
	@DisplayName("Record 3903: Address is 641 Higuera St")
	void AddressOfRecord3903() {
		assertEquals("641 Higuera St", customers.get(3902).getAddress());
	}

	@Test
	@DisplayName("Record 3903: City is San Luis Obispo")
	void CityOfRecord3903() {
		assertEquals("San Luis Obispo", customers.get(3902).getCity());
	}

	@Test
	@DisplayName("Record 3903: County is San Luis Obispo")
	void CountyOfRecord3903() {
		assertEquals("San Luis Obispo", customers.get(3902).getCounty());
	}

	@Test
	@DisplayName("Record 3903: State is CA")
	void StateOfRecord3903() {
		assertEquals("CA", customers.get(3902).getState());
	}

	@Test
	@DisplayName("Record 3903: ZIP is 93401")
	void ZIPOfRecord3903() {
		assertEquals("93401", customers.get(3902).getZIP());
	}

	@Test
	@DisplayName("Record 3903: Phone is 805-543-8805")
	void PhoneOfRecord3903() {
		assertEquals("805-543-8805", customers.get(3902).getPhone());
	}

	@Test
	@DisplayName("Record 3903: Fax is 805-543-8569")
	void FaxOfRecord3903() {
		assertEquals("805-543-8569", customers.get(3902).getFax());
	}

	@Test
	@DisplayName("Record 3903: Email is roderick@throneberry.com")
	void EmailOfRecord3903() {
		assertEquals("roderick@throneberry.com", customers.get(3902).getEmail());
	}

	@Test
	@DisplayName("Record 3903: Web is http://www.roderickthroneberry.com")
	void WebOfRecord3903() {
		assertEquals("http://www.roderickthroneberry.com", customers.get(3902).getWeb());
	}
}
