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

@Tag("30")
class Record_2415 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2415: FirstName is Pat")
	void FirstNameOfRecord2415() {
		assertEquals("Pat", customers.get(2414).getFirstName());
	}

	@Test
	@DisplayName("Record 2415: LastName is Aulds")
	void LastNameOfRecord2415() {
		assertEquals("Aulds", customers.get(2414).getLastName());
	}

	@Test
	@DisplayName("Record 2415: Company is Tiller, Steven E Esq")
	void CompanyOfRecord2415() {
		assertEquals("Tiller, Steven E Esq", customers.get(2414).getCompany());
	}

	@Test
	@DisplayName("Record 2415: Address is 2109 English Rd")
	void AddressOfRecord2415() {
		assertEquals("2109 English Rd", customers.get(2414).getAddress());
	}

	@Test
	@DisplayName("Record 2415: City is High Point")
	void CityOfRecord2415() {
		assertEquals("High Point", customers.get(2414).getCity());
	}

	@Test
	@DisplayName("Record 2415: County is Guilford")
	void CountyOfRecord2415() {
		assertEquals("Guilford", customers.get(2414).getCounty());
	}

	@Test
	@DisplayName("Record 2415: State is NC")
	void StateOfRecord2415() {
		assertEquals("NC", customers.get(2414).getState());
	}

	@Test
	@DisplayName("Record 2415: ZIP is 27262")
	void ZIPOfRecord2415() {
		assertEquals("27262", customers.get(2414).getZIP());
	}

	@Test
	@DisplayName("Record 2415: Phone is 336-882-5503")
	void PhoneOfRecord2415() {
		assertEquals("336-882-5503", customers.get(2414).getPhone());
	}

	@Test
	@DisplayName("Record 2415: Fax is 336-882-7932")
	void FaxOfRecord2415() {
		assertEquals("336-882-7932", customers.get(2414).getFax());
	}

	@Test
	@DisplayName("Record 2415: Email is pat@aulds.com")
	void EmailOfRecord2415() {
		assertEquals("pat@aulds.com", customers.get(2414).getEmail());
	}

	@Test
	@DisplayName("Record 2415: Web is http://www.pataulds.com")
	void WebOfRecord2415() {
		assertEquals("http://www.pataulds.com", customers.get(2414).getWeb());
	}
}
