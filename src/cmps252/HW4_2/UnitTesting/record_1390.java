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

@Tag("43")
class Record_1390 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1390: FirstName is Morgan")
	void FirstNameOfRecord1390() {
		assertEquals("Morgan", customers.get(1389).getFirstName());
	}

	@Test
	@DisplayName("Record 1390: LastName is Contrino")
	void LastNameOfRecord1390() {
		assertEquals("Contrino", customers.get(1389).getLastName());
	}

	@Test
	@DisplayName("Record 1390: Company is American Beauty Bedding Co")
	void CompanyOfRecord1390() {
		assertEquals("American Beauty Bedding Co", customers.get(1389).getCompany());
	}

	@Test
	@DisplayName("Record 1390: Address is 303 Ross St")
	void AddressOfRecord1390() {
		assertEquals("303 Ross St", customers.get(1389).getAddress());
	}

	@Test
	@DisplayName("Record 1390: City is Amarillo")
	void CityOfRecord1390() {
		assertEquals("Amarillo", customers.get(1389).getCity());
	}

	@Test
	@DisplayName("Record 1390: County is Potter")
	void CountyOfRecord1390() {
		assertEquals("Potter", customers.get(1389).getCounty());
	}

	@Test
	@DisplayName("Record 1390: State is TX")
	void StateOfRecord1390() {
		assertEquals("TX", customers.get(1389).getState());
	}

	@Test
	@DisplayName("Record 1390: ZIP is 79102")
	void ZIPOfRecord1390() {
		assertEquals("79102", customers.get(1389).getZIP());
	}

	@Test
	@DisplayName("Record 1390: Phone is 806-374-5417")
	void PhoneOfRecord1390() {
		assertEquals("806-374-5417", customers.get(1389).getPhone());
	}

	@Test
	@DisplayName("Record 1390: Fax is 806-374-8449")
	void FaxOfRecord1390() {
		assertEquals("806-374-8449", customers.get(1389).getFax());
	}

	@Test
	@DisplayName("Record 1390: Email is morgan@contrino.com")
	void EmailOfRecord1390() {
		assertEquals("morgan@contrino.com", customers.get(1389).getEmail());
	}

	@Test
	@DisplayName("Record 1390: Web is http://www.morgancontrino.com")
	void WebOfRecord1390() {
		assertEquals("http://www.morgancontrino.com", customers.get(1389).getWeb());
	}
}
