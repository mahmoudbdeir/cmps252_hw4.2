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

@Tag("20")
class Record_4927 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4927: FirstName is Maritsa")
	void FirstNameOfRecord4927() {
		assertEquals("Maritsa", customers.get(4926).getFirstName());
	}

	@Test
	@DisplayName("Record 4927: LastName is Pomeroy")
	void LastNameOfRecord4927() {
		assertEquals("Pomeroy", customers.get(4926).getLastName());
	}

	@Test
	@DisplayName("Record 4927: Company is Anchor Drugs")
	void CompanyOfRecord4927() {
		assertEquals("Anchor Drugs", customers.get(4926).getCompany());
	}

	@Test
	@DisplayName("Record 4927: Address is 1600 Market St  #-1418")
	void AddressOfRecord4927() {
		assertEquals("1600 Market St  #-1418", customers.get(4926).getAddress());
	}

	@Test
	@DisplayName("Record 4927: City is Philadelphia")
	void CityOfRecord4927() {
		assertEquals("Philadelphia", customers.get(4926).getCity());
	}

	@Test
	@DisplayName("Record 4927: County is Philadelphia")
	void CountyOfRecord4927() {
		assertEquals("Philadelphia", customers.get(4926).getCounty());
	}

	@Test
	@DisplayName("Record 4927: State is PA")
	void StateOfRecord4927() {
		assertEquals("PA", customers.get(4926).getState());
	}

	@Test
	@DisplayName("Record 4927: ZIP is 19103")
	void ZIPOfRecord4927() {
		assertEquals("19103", customers.get(4926).getZIP());
	}

	@Test
	@DisplayName("Record 4927: Phone is 215-569-8725")
	void PhoneOfRecord4927() {
		assertEquals("215-569-8725", customers.get(4926).getPhone());
	}

	@Test
	@DisplayName("Record 4927: Fax is 215-569-6576")
	void FaxOfRecord4927() {
		assertEquals("215-569-6576", customers.get(4926).getFax());
	}

	@Test
	@DisplayName("Record 4927: Email is maritsa@pomeroy.com")
	void EmailOfRecord4927() {
		assertEquals("maritsa@pomeroy.com", customers.get(4926).getEmail());
	}

	@Test
	@DisplayName("Record 4927: Web is http://www.maritsapomeroy.com")
	void WebOfRecord4927() {
		assertEquals("http://www.maritsapomeroy.com", customers.get(4926).getWeb());
	}
}
