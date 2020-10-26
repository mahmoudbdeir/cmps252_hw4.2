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

@Tag("17")
class Record_4847 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4847: FirstName is Chong")
	void FirstNameOfRecord4847() {
		assertEquals("Chong", customers.get(4846).getFirstName());
	}

	@Test
	@DisplayName("Record 4847: LastName is stoneau")
	void LastNameOfRecord4847() {
		assertEquals("stoneau", customers.get(4846).getLastName());
	}

	@Test
	@DisplayName("Record 4847: Company is Komar, Michael S Esq")
	void CompanyOfRecord4847() {
		assertEquals("Komar, Michael S Esq", customers.get(4846).getCompany());
	}

	@Test
	@DisplayName("Record 4847: Address is 11 Kilmer Ct")
	void AddressOfRecord4847() {
		assertEquals("11 Kilmer Ct", customers.get(4846).getAddress());
	}

	@Test
	@DisplayName("Record 4847: City is Edison")
	void CityOfRecord4847() {
		assertEquals("Edison", customers.get(4846).getCity());
	}

	@Test
	@DisplayName("Record 4847: County is Middlesex")
	void CountyOfRecord4847() {
		assertEquals("Middlesex", customers.get(4846).getCounty());
	}

	@Test
	@DisplayName("Record 4847: State is NJ")
	void StateOfRecord4847() {
		assertEquals("NJ", customers.get(4846).getState());
	}

	@Test
	@DisplayName("Record 4847: ZIP is 8817")
	void ZIPOfRecord4847() {
		assertEquals("8817", customers.get(4846).getZIP());
	}

	@Test
	@DisplayName("Record 4847: Phone is 732-985-3748")
	void PhoneOfRecord4847() {
		assertEquals("732-985-3748", customers.get(4846).getPhone());
	}

	@Test
	@DisplayName("Record 4847: Fax is 732-985-1916")
	void FaxOfRecord4847() {
		assertEquals("732-985-1916", customers.get(4846).getFax());
	}

	@Test
	@DisplayName("Record 4847: Email is chong@stoneau.com")
	void EmailOfRecord4847() {
		assertEquals("chong@stoneau.com", customers.get(4846).getEmail());
	}

	@Test
	@DisplayName("Record 4847: Web is http://www.chongstoneau.com")
	void WebOfRecord4847() {
		assertEquals("http://www.chongstoneau.com", customers.get(4846).getWeb());
	}
}
