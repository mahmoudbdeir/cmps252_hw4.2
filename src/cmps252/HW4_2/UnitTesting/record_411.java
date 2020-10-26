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
class Record_411 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 411: FirstName is Solomon")
	void FirstNameOfRecord411() {
		assertEquals("Solomon", customers.get(410).getFirstName());
	}

	@Test
	@DisplayName("Record 411: LastName is Hollenberg")
	void LastNameOfRecord411() {
		assertEquals("Hollenberg", customers.get(410).getLastName());
	}

	@Test
	@DisplayName("Record 411: Company is Coeur Dalene Teachers Crdt Un")
	void CompanyOfRecord411() {
		assertEquals("Coeur Dalene Teachers Crdt Un", customers.get(410).getCompany());
	}

	@Test
	@DisplayName("Record 411: Address is 7343 Ronson Rd  #-v")
	void AddressOfRecord411() {
		assertEquals("7343 Ronson Rd  #-v", customers.get(410).getAddress());
	}

	@Test
	@DisplayName("Record 411: City is San Diego")
	void CityOfRecord411() {
		assertEquals("San Diego", customers.get(410).getCity());
	}

	@Test
	@DisplayName("Record 411: County is San Diego")
	void CountyOfRecord411() {
		assertEquals("San Diego", customers.get(410).getCounty());
	}

	@Test
	@DisplayName("Record 411: State is CA")
	void StateOfRecord411() {
		assertEquals("CA", customers.get(410).getState());
	}

	@Test
	@DisplayName("Record 411: ZIP is 92111")
	void ZIPOfRecord411() {
		assertEquals("92111", customers.get(410).getZIP());
	}

	@Test
	@DisplayName("Record 411: Phone is 858-277-7591")
	void PhoneOfRecord411() {
		assertEquals("858-277-7591", customers.get(410).getPhone());
	}

	@Test
	@DisplayName("Record 411: Fax is 858-277-2766")
	void FaxOfRecord411() {
		assertEquals("858-277-2766", customers.get(410).getFax());
	}

	@Test
	@DisplayName("Record 411: Email is solomon@hollenberg.com")
	void EmailOfRecord411() {
		assertEquals("solomon@hollenberg.com", customers.get(410).getEmail());
	}

	@Test
	@DisplayName("Record 411: Web is http://www.solomonhollenberg.com")
	void WebOfRecord411() {
		assertEquals("http://www.solomonhollenberg.com", customers.get(410).getWeb());
	}
}
