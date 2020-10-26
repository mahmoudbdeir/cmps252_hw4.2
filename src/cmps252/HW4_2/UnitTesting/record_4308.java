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

@Tag("1")
class Record_4308 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4308: FirstName is Lorna")
	void FirstNameOfRecord4308() {
		assertEquals("Lorna", customers.get(4307).getFirstName());
	}

	@Test
	@DisplayName("Record 4308: LastName is Martelli")
	void LastNameOfRecord4308() {
		assertEquals("Martelli", customers.get(4307).getLastName());
	}

	@Test
	@DisplayName("Record 4308: Company is Stebelton Aranda & Snider")
	void CompanyOfRecord4308() {
		assertEquals("Stebelton Aranda & Snider", customers.get(4307).getCompany());
	}

	@Test
	@DisplayName("Record 4308: Address is 615 Hope Rd")
	void AddressOfRecord4308() {
		assertEquals("615 Hope Rd", customers.get(4307).getAddress());
	}

	@Test
	@DisplayName("Record 4308: City is Eatontown")
	void CityOfRecord4308() {
		assertEquals("Eatontown", customers.get(4307).getCity());
	}

	@Test
	@DisplayName("Record 4308: County is Monmouth")
	void CountyOfRecord4308() {
		assertEquals("Monmouth", customers.get(4307).getCounty());
	}

	@Test
	@DisplayName("Record 4308: State is NJ")
	void StateOfRecord4308() {
		assertEquals("NJ", customers.get(4307).getState());
	}

	@Test
	@DisplayName("Record 4308: ZIP is 7724")
	void ZIPOfRecord4308() {
		assertEquals("7724", customers.get(4307).getZIP());
	}

	@Test
	@DisplayName("Record 4308: Phone is 732-542-5491")
	void PhoneOfRecord4308() {
		assertEquals("732-542-5491", customers.get(4307).getPhone());
	}

	@Test
	@DisplayName("Record 4308: Fax is 732-542-5844")
	void FaxOfRecord4308() {
		assertEquals("732-542-5844", customers.get(4307).getFax());
	}

	@Test
	@DisplayName("Record 4308: Email is lorna@martelli.com")
	void EmailOfRecord4308() {
		assertEquals("lorna@martelli.com", customers.get(4307).getEmail());
	}

	@Test
	@DisplayName("Record 4308: Web is http://www.lornamartelli.com")
	void WebOfRecord4308() {
		assertEquals("http://www.lornamartelli.com", customers.get(4307).getWeb());
	}
}
