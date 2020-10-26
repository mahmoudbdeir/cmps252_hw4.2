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

@Tag("27")
class Record_3198 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3198: FirstName is Anastasia")
	void FirstNameOfRecord3198() {
		assertEquals("Anastasia", customers.get(3197).getFirstName());
	}

	@Test
	@DisplayName("Record 3198: LastName is Causey")
	void LastNameOfRecord3198() {
		assertEquals("Causey", customers.get(3197).getLastName());
	}

	@Test
	@DisplayName("Record 3198: Company is Fine, Joseph M Esq")
	void CompanyOfRecord3198() {
		assertEquals("Fine, Joseph M Esq", customers.get(3197).getCompany());
	}

	@Test
	@DisplayName("Record 3198: Address is 2205 S Yale St")
	void AddressOfRecord3198() {
		assertEquals("2205 S Yale St", customers.get(3197).getAddress());
	}

	@Test
	@DisplayName("Record 3198: City is Santa Ana")
	void CityOfRecord3198() {
		assertEquals("Santa Ana", customers.get(3197).getCity());
	}

	@Test
	@DisplayName("Record 3198: County is Orange")
	void CountyOfRecord3198() {
		assertEquals("Orange", customers.get(3197).getCounty());
	}

	@Test
	@DisplayName("Record 3198: State is CA")
	void StateOfRecord3198() {
		assertEquals("CA", customers.get(3197).getState());
	}

	@Test
	@DisplayName("Record 3198: ZIP is 92704")
	void ZIPOfRecord3198() {
		assertEquals("92704", customers.get(3197).getZIP());
	}

	@Test
	@DisplayName("Record 3198: Phone is 714-540-7416")
	void PhoneOfRecord3198() {
		assertEquals("714-540-7416", customers.get(3197).getPhone());
	}

	@Test
	@DisplayName("Record 3198: Fax is 714-540-1023")
	void FaxOfRecord3198() {
		assertEquals("714-540-1023", customers.get(3197).getFax());
	}

	@Test
	@DisplayName("Record 3198: Email is anastasia@causey.com")
	void EmailOfRecord3198() {
		assertEquals("anastasia@causey.com", customers.get(3197).getEmail());
	}

	@Test
	@DisplayName("Record 3198: Web is http://www.anastasiacausey.com")
	void WebOfRecord3198() {
		assertEquals("http://www.anastasiacausey.com", customers.get(3197).getWeb());
	}
}
