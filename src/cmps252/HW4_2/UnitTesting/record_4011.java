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

@Tag("49")
class Record_4011 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4011: FirstName is Tiffani")
	void FirstNameOfRecord4011() {
		assertEquals("Tiffani", customers.get(4010).getFirstName());
	}

	@Test
	@DisplayName("Record 4011: LastName is Alevras")
	void LastNameOfRecord4011() {
		assertEquals("Alevras", customers.get(4010).getLastName());
	}

	@Test
	@DisplayName("Record 4011: Company is Robol, Richard T Esq")
	void CompanyOfRecord4011() {
		assertEquals("Robol, Richard T Esq", customers.get(4010).getCompany());
	}

	@Test
	@DisplayName("Record 4011: Address is 1101 N 1st St")
	void AddressOfRecord4011() {
		assertEquals("1101 N 1st St", customers.get(4010).getAddress());
	}

	@Test
	@DisplayName("Record 4011: City is Abilene")
	void CityOfRecord4011() {
		assertEquals("Abilene", customers.get(4010).getCity());
	}

	@Test
	@DisplayName("Record 4011: County is Taylor")
	void CountyOfRecord4011() {
		assertEquals("Taylor", customers.get(4010).getCounty());
	}

	@Test
	@DisplayName("Record 4011: State is TX")
	void StateOfRecord4011() {
		assertEquals("TX", customers.get(4010).getState());
	}

	@Test
	@DisplayName("Record 4011: ZIP is 79601")
	void ZIPOfRecord4011() {
		assertEquals("79601", customers.get(4010).getZIP());
	}

	@Test
	@DisplayName("Record 4011: Phone is 325-677-1836")
	void PhoneOfRecord4011() {
		assertEquals("325-677-1836", customers.get(4010).getPhone());
	}

	@Test
	@DisplayName("Record 4011: Fax is 325-677-0687")
	void FaxOfRecord4011() {
		assertEquals("325-677-0687", customers.get(4010).getFax());
	}

	@Test
	@DisplayName("Record 4011: Email is tiffani@alevras.com")
	void EmailOfRecord4011() {
		assertEquals("tiffani@alevras.com", customers.get(4010).getEmail());
	}

	@Test
	@DisplayName("Record 4011: Web is http://www.tiffanialevras.com")
	void WebOfRecord4011() {
		assertEquals("http://www.tiffanialevras.com", customers.get(4010).getWeb());
	}
}
