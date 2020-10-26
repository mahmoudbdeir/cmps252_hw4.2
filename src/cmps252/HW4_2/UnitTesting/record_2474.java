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

@Tag("12")
class Record_2474 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2474: FirstName is Tricia")
	void FirstNameOfRecord2474() {
		assertEquals("Tricia", customers.get(2473).getFirstName());
	}

	@Test
	@DisplayName("Record 2474: LastName is Zappala")
	void LastNameOfRecord2474() {
		assertEquals("Zappala", customers.get(2473).getLastName());
	}

	@Test
	@DisplayName("Record 2474: Company is Ficklin, Patrice Alexander Esq")
	void CompanyOfRecord2474() {
		assertEquals("Ficklin, Patrice Alexander Esq", customers.get(2473).getCompany());
	}

	@Test
	@DisplayName("Record 2474: Address is 968 Bradley St")
	void AddressOfRecord2474() {
		assertEquals("968 Bradley St", customers.get(2473).getAddress());
	}

	@Test
	@DisplayName("Record 2474: City is Watertown")
	void CityOfRecord2474() {
		assertEquals("Watertown", customers.get(2473).getCity());
	}

	@Test
	@DisplayName("Record 2474: County is Jefferson")
	void CountyOfRecord2474() {
		assertEquals("Jefferson", customers.get(2473).getCounty());
	}

	@Test
	@DisplayName("Record 2474: State is NY")
	void StateOfRecord2474() {
		assertEquals("NY", customers.get(2473).getState());
	}

	@Test
	@DisplayName("Record 2474: ZIP is 13601")
	void ZIPOfRecord2474() {
		assertEquals("13601", customers.get(2473).getZIP());
	}

	@Test
	@DisplayName("Record 2474: Phone is 315-788-1579")
	void PhoneOfRecord2474() {
		assertEquals("315-788-1579", customers.get(2473).getPhone());
	}

	@Test
	@DisplayName("Record 2474: Fax is 315-788-4542")
	void FaxOfRecord2474() {
		assertEquals("315-788-4542", customers.get(2473).getFax());
	}

	@Test
	@DisplayName("Record 2474: Email is tricia@zappala.com")
	void EmailOfRecord2474() {
		assertEquals("tricia@zappala.com", customers.get(2473).getEmail());
	}

	@Test
	@DisplayName("Record 2474: Web is http://www.triciazappala.com")
	void WebOfRecord2474() {
		assertEquals("http://www.triciazappala.com", customers.get(2473).getWeb());
	}
}
