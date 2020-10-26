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

@Tag("41")
class Record_4012 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4012: FirstName is Corey")
	void FirstNameOfRecord4012() {
		assertEquals("Corey", customers.get(4011).getFirstName());
	}

	@Test
	@DisplayName("Record 4012: LastName is Gutierrex")
	void LastNameOfRecord4012() {
		assertEquals("Gutierrex", customers.get(4011).getLastName());
	}

	@Test
	@DisplayName("Record 4012: Company is Winterport Boot Shop")
	void CompanyOfRecord4012() {
		assertEquals("Winterport Boot Shop", customers.get(4011).getCompany());
	}

	@Test
	@DisplayName("Record 4012: Address is 1100 N 6th St")
	void AddressOfRecord4012() {
		assertEquals("1100 N 6th St", customers.get(4011).getAddress());
	}

	@Test
	@DisplayName("Record 4012: City is Abilene")
	void CityOfRecord4012() {
		assertEquals("Abilene", customers.get(4011).getCity());
	}

	@Test
	@DisplayName("Record 4012: County is Taylor")
	void CountyOfRecord4012() {
		assertEquals("Taylor", customers.get(4011).getCounty());
	}

	@Test
	@DisplayName("Record 4012: State is TX")
	void StateOfRecord4012() {
		assertEquals("TX", customers.get(4011).getState());
	}

	@Test
	@DisplayName("Record 4012: ZIP is 79601")
	void ZIPOfRecord4012() {
		assertEquals("79601", customers.get(4011).getZIP());
	}

	@Test
	@DisplayName("Record 4012: Phone is 325-672-6480")
	void PhoneOfRecord4012() {
		assertEquals("325-672-6480", customers.get(4011).getPhone());
	}

	@Test
	@DisplayName("Record 4012: Fax is 325-672-7413")
	void FaxOfRecord4012() {
		assertEquals("325-672-7413", customers.get(4011).getFax());
	}

	@Test
	@DisplayName("Record 4012: Email is corey@gutierrex.com")
	void EmailOfRecord4012() {
		assertEquals("corey@gutierrex.com", customers.get(4011).getEmail());
	}

	@Test
	@DisplayName("Record 4012: Web is http://www.coreygutierrex.com")
	void WebOfRecord4012() {
		assertEquals("http://www.coreygutierrex.com", customers.get(4011).getWeb());
	}
}
