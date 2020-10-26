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

@Tag("39")
class Record_4644 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4644: FirstName is Darron")
	void FirstNameOfRecord4644() {
		assertEquals("Darron", customers.get(4643).getFirstName());
	}

	@Test
	@DisplayName("Record 4644: LastName is Baragona")
	void LastNameOfRecord4644() {
		assertEquals("Baragona", customers.get(4643).getLastName());
	}

	@Test
	@DisplayName("Record 4644: Company is Burt, Michael D Esq")
	void CompanyOfRecord4644() {
		assertEquals("Burt, Michael D Esq", customers.get(4643).getCompany());
	}

	@Test
	@DisplayName("Record 4644: Address is 1019 Auburn Ave")
	void AddressOfRecord4644() {
		assertEquals("1019 Auburn Ave", customers.get(4643).getAddress());
	}

	@Test
	@DisplayName("Record 4644: City is Lafayette")
	void CityOfRecord4644() {
		assertEquals("Lafayette", customers.get(4643).getCity());
	}

	@Test
	@DisplayName("Record 4644: County is Lafayette")
	void CountyOfRecord4644() {
		assertEquals("Lafayette", customers.get(4643).getCounty());
	}

	@Test
	@DisplayName("Record 4644: State is LA")
	void StateOfRecord4644() {
		assertEquals("LA", customers.get(4643).getState());
	}

	@Test
	@DisplayName("Record 4644: ZIP is 70503")
	void ZIPOfRecord4644() {
		assertEquals("70503", customers.get(4643).getZIP());
	}

	@Test
	@DisplayName("Record 4644: Phone is 337-232-2454")
	void PhoneOfRecord4644() {
		assertEquals("337-232-2454", customers.get(4643).getPhone());
	}

	@Test
	@DisplayName("Record 4644: Fax is 337-232-1809")
	void FaxOfRecord4644() {
		assertEquals("337-232-1809", customers.get(4643).getFax());
	}

	@Test
	@DisplayName("Record 4644: Email is darron@baragona.com")
	void EmailOfRecord4644() {
		assertEquals("darron@baragona.com", customers.get(4643).getEmail());
	}

	@Test
	@DisplayName("Record 4644: Web is http://www.darronbaragona.com")
	void WebOfRecord4644() {
		assertEquals("http://www.darronbaragona.com", customers.get(4643).getWeb());
	}
}
