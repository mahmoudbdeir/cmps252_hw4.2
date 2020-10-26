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

@Tag("24")
class Record_2912 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2912: FirstName is Lester")
	void FirstNameOfRecord2912() {
		assertEquals("Lester", customers.get(2911).getFirstName());
	}

	@Test
	@DisplayName("Record 2912: LastName is Downum")
	void LastNameOfRecord2912() {
		assertEquals("Downum", customers.get(2911).getLastName());
	}

	@Test
	@DisplayName("Record 2912: Company is America Floor Covering")
	void CompanyOfRecord2912() {
		assertEquals("America Floor Covering", customers.get(2911).getCompany());
	}

	@Test
	@DisplayName("Record 2912: Address is 1515 N Westshore Blvd")
	void AddressOfRecord2912() {
		assertEquals("1515 N Westshore Blvd", customers.get(2911).getAddress());
	}

	@Test
	@DisplayName("Record 2912: City is Tampa")
	void CityOfRecord2912() {
		assertEquals("Tampa", customers.get(2911).getCity());
	}

	@Test
	@DisplayName("Record 2912: County is Hillsborough")
	void CountyOfRecord2912() {
		assertEquals("Hillsborough", customers.get(2911).getCounty());
	}

	@Test
	@DisplayName("Record 2912: State is FL")
	void StateOfRecord2912() {
		assertEquals("FL", customers.get(2911).getState());
	}

	@Test
	@DisplayName("Record 2912: ZIP is 33607")
	void ZIPOfRecord2912() {
		assertEquals("33607", customers.get(2911).getZIP());
	}

	@Test
	@DisplayName("Record 2912: Phone is 813-289-2653")
	void PhoneOfRecord2912() {
		assertEquals("813-289-2653", customers.get(2911).getPhone());
	}

	@Test
	@DisplayName("Record 2912: Fax is 813-289-2632")
	void FaxOfRecord2912() {
		assertEquals("813-289-2632", customers.get(2911).getFax());
	}

	@Test
	@DisplayName("Record 2912: Email is lester@downum.com")
	void EmailOfRecord2912() {
		assertEquals("lester@downum.com", customers.get(2911).getEmail());
	}

	@Test
	@DisplayName("Record 2912: Web is http://www.lesterdownum.com")
	void WebOfRecord2912() {
		assertEquals("http://www.lesterdownum.com", customers.get(2911).getWeb());
	}
}
