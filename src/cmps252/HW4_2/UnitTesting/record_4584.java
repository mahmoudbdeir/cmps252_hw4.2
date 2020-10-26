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

@Tag("25")
class Record_4584 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4584: FirstName is Nickolas")
	void FirstNameOfRecord4584() {
		assertEquals("Nickolas", customers.get(4583).getFirstName());
	}

	@Test
	@DisplayName("Record 4584: LastName is Wyk")
	void LastNameOfRecord4584() {
		assertEquals("Wyk", customers.get(4583).getLastName());
	}

	@Test
	@DisplayName("Record 4584: Company is Indiacrafts Inc")
	void CompanyOfRecord4584() {
		assertEquals("Indiacrafts Inc", customers.get(4583).getCompany());
	}

	@Test
	@DisplayName("Record 4584: Address is 220 Sandy Springs Cir Ne")
	void AddressOfRecord4584() {
		assertEquals("220 Sandy Springs Cir Ne", customers.get(4583).getAddress());
	}

	@Test
	@DisplayName("Record 4584: City is Atlanta")
	void CityOfRecord4584() {
		assertEquals("Atlanta", customers.get(4583).getCity());
	}

	@Test
	@DisplayName("Record 4584: County is Fulton")
	void CountyOfRecord4584() {
		assertEquals("Fulton", customers.get(4583).getCounty());
	}

	@Test
	@DisplayName("Record 4584: State is GA")
	void StateOfRecord4584() {
		assertEquals("GA", customers.get(4583).getState());
	}

	@Test
	@DisplayName("Record 4584: ZIP is 30328")
	void ZIPOfRecord4584() {
		assertEquals("30328", customers.get(4583).getZIP());
	}

	@Test
	@DisplayName("Record 4584: Phone is 770-303-6169")
	void PhoneOfRecord4584() {
		assertEquals("770-303-6169", customers.get(4583).getPhone());
	}

	@Test
	@DisplayName("Record 4584: Fax is 770-303-5008")
	void FaxOfRecord4584() {
		assertEquals("770-303-5008", customers.get(4583).getFax());
	}

	@Test
	@DisplayName("Record 4584: Email is nickolas@wyk.com")
	void EmailOfRecord4584() {
		assertEquals("nickolas@wyk.com", customers.get(4583).getEmail());
	}

	@Test
	@DisplayName("Record 4584: Web is http://www.nickolaswyk.com")
	void WebOfRecord4584() {
		assertEquals("http://www.nickolaswyk.com", customers.get(4583).getWeb());
	}
}
