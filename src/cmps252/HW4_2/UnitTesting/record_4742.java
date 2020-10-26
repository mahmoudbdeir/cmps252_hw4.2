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

@Tag("13")
class Record_4742 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4742: FirstName is Linda")
	void FirstNameOfRecord4742() {
		assertEquals("Linda", customers.get(4741).getFirstName());
	}

	@Test
	@DisplayName("Record 4742: LastName is Narkier")
	void LastNameOfRecord4742() {
		assertEquals("Narkier", customers.get(4741).getLastName());
	}

	@Test
	@DisplayName("Record 4742: Company is Diamond Rite Products Co")
	void CompanyOfRecord4742() {
		assertEquals("Diamond Rite Products Co", customers.get(4741).getCompany());
	}

	@Test
	@DisplayName("Record 4742: Address is 33 Tomlinson Rd")
	void AddressOfRecord4742() {
		assertEquals("33 Tomlinson Rd", customers.get(4741).getAddress());
	}

	@Test
	@DisplayName("Record 4742: City is Huntingdon Valley")
	void CityOfRecord4742() {
		assertEquals("Huntingdon Valley", customers.get(4741).getCity());
	}

	@Test
	@DisplayName("Record 4742: County is Montgomery")
	void CountyOfRecord4742() {
		assertEquals("Montgomery", customers.get(4741).getCounty());
	}

	@Test
	@DisplayName("Record 4742: State is PA")
	void StateOfRecord4742() {
		assertEquals("PA", customers.get(4741).getState());
	}

	@Test
	@DisplayName("Record 4742: ZIP is 19006")
	void ZIPOfRecord4742() {
		assertEquals("19006", customers.get(4741).getZIP());
	}

	@Test
	@DisplayName("Record 4742: Phone is 215-947-9854")
	void PhoneOfRecord4742() {
		assertEquals("215-947-9854", customers.get(4741).getPhone());
	}

	@Test
	@DisplayName("Record 4742: Fax is 215-947-6829")
	void FaxOfRecord4742() {
		assertEquals("215-947-6829", customers.get(4741).getFax());
	}

	@Test
	@DisplayName("Record 4742: Email is linda@narkier.com")
	void EmailOfRecord4742() {
		assertEquals("linda@narkier.com", customers.get(4741).getEmail());
	}

	@Test
	@DisplayName("Record 4742: Web is http://www.lindanarkier.com")
	void WebOfRecord4742() {
		assertEquals("http://www.lindanarkier.com", customers.get(4741).getWeb());
	}
}
