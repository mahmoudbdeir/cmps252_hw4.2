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

@Tag("34")
class Record_2193 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2193: FirstName is Karyn")
	void FirstNameOfRecord2193() {
		assertEquals("Karyn", customers.get(2192).getFirstName());
	}

	@Test
	@DisplayName("Record 2193: LastName is Kimberl")
	void LastNameOfRecord2193() {
		assertEquals("Kimberl", customers.get(2192).getLastName());
	}

	@Test
	@DisplayName("Record 2193: Company is Getman, Charles W Esq")
	void CompanyOfRecord2193() {
		assertEquals("Getman, Charles W Esq", customers.get(2192).getCompany());
	}

	@Test
	@DisplayName("Record 2193: Address is 401 S Euclid St")
	void AddressOfRecord2193() {
		assertEquals("401 S Euclid St", customers.get(2192).getAddress());
	}

	@Test
	@DisplayName("Record 2193: City is Anahym")
	void CityOfRecord2193() {
		assertEquals("Anahym", customers.get(2192).getCity());
	}

	@Test
	@DisplayName("Record 2193: County is Orange")
	void CountyOfRecord2193() {
		assertEquals("Orange", customers.get(2192).getCounty());
	}

	@Test
	@DisplayName("Record 2193: State is CA")
	void StateOfRecord2193() {
		assertEquals("CA", customers.get(2192).getState());
	}

	@Test
	@DisplayName("Record 2193: ZIP is 92802")
	void ZIPOfRecord2193() {
		assertEquals("92802", customers.get(2192).getZIP());
	}

	@Test
	@DisplayName("Record 2193: Phone is 714-772-7217")
	void PhoneOfRecord2193() {
		assertEquals("714-772-7217", customers.get(2192).getPhone());
	}

	@Test
	@DisplayName("Record 2193: Fax is 714-772-5234")
	void FaxOfRecord2193() {
		assertEquals("714-772-5234", customers.get(2192).getFax());
	}

	@Test
	@DisplayName("Record 2193: Email is karyn@kimberl.com")
	void EmailOfRecord2193() {
		assertEquals("karyn@kimberl.com", customers.get(2192).getEmail());
	}

	@Test
	@DisplayName("Record 2193: Web is http://www.karynkimberl.com")
	void WebOfRecord2193() {
		assertEquals("http://www.karynkimberl.com", customers.get(2192).getWeb());
	}
}
