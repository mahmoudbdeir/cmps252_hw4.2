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

@Tag("35")
class Record_4091 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4091: FirstName is Glen")
	void FirstNameOfRecord4091() {
		assertEquals("Glen", customers.get(4090).getFirstName());
	}

	@Test
	@DisplayName("Record 4091: LastName is Mongeau")
	void LastNameOfRecord4091() {
		assertEquals("Mongeau", customers.get(4090).getLastName());
	}

	@Test
	@DisplayName("Record 4091: Company is Wfrn Fm 104 7 Am")
	void CompanyOfRecord4091() {
		assertEquals("Wfrn Fm 104 7 Am", customers.get(4090).getCompany());
	}

	@Test
	@DisplayName("Record 4091: Address is 18 Mileed Way")
	void AddressOfRecord4091() {
		assertEquals("18 Mileed Way", customers.get(4090).getAddress());
	}

	@Test
	@DisplayName("Record 4091: City is Avenel")
	void CityOfRecord4091() {
		assertEquals("Avenel", customers.get(4090).getCity());
	}

	@Test
	@DisplayName("Record 4091: County is Middlesex")
	void CountyOfRecord4091() {
		assertEquals("Middlesex", customers.get(4090).getCounty());
	}

	@Test
	@DisplayName("Record 4091: State is NJ")
	void StateOfRecord4091() {
		assertEquals("NJ", customers.get(4090).getState());
	}

	@Test
	@DisplayName("Record 4091: ZIP is 7001")
	void ZIPOfRecord4091() {
		assertEquals("7001", customers.get(4090).getZIP());
	}

	@Test
	@DisplayName("Record 4091: Phone is 732-382-4902")
	void PhoneOfRecord4091() {
		assertEquals("732-382-4902", customers.get(4090).getPhone());
	}

	@Test
	@DisplayName("Record 4091: Fax is 732-382-2146")
	void FaxOfRecord4091() {
		assertEquals("732-382-2146", customers.get(4090).getFax());
	}

	@Test
	@DisplayName("Record 4091: Email is glen@mongeau.com")
	void EmailOfRecord4091() {
		assertEquals("glen@mongeau.com", customers.get(4090).getEmail());
	}

	@Test
	@DisplayName("Record 4091: Web is http://www.glenmongeau.com")
	void WebOfRecord4091() {
		assertEquals("http://www.glenmongeau.com", customers.get(4090).getWeb());
	}
}
