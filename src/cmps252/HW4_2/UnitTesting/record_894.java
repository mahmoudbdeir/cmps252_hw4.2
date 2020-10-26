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

@Tag("46")
class Record_894 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 894: FirstName is Iona")
	void FirstNameOfRecord894() {
		assertEquals("Iona", customers.get(893).getFirstName());
	}

	@Test
	@DisplayName("Record 894: LastName is Burkhart")
	void LastNameOfRecord894() {
		assertEquals("Burkhart", customers.get(893).getLastName());
	}

	@Test
	@DisplayName("Record 894: Company is Club Of Cape Cod")
	void CompanyOfRecord894() {
		assertEquals("Club Of Cape Cod", customers.get(893).getCompany());
	}

	@Test
	@DisplayName("Record 894: Address is 391 Danforth Ave")
	void AddressOfRecord894() {
		assertEquals("391 Danforth Ave", customers.get(893).getAddress());
	}

	@Test
	@DisplayName("Record 894: City is Jersey City")
	void CityOfRecord894() {
		assertEquals("Jersey City", customers.get(893).getCity());
	}

	@Test
	@DisplayName("Record 894: County is Hudson")
	void CountyOfRecord894() {
		assertEquals("Hudson", customers.get(893).getCounty());
	}

	@Test
	@DisplayName("Record 894: State is NJ")
	void StateOfRecord894() {
		assertEquals("NJ", customers.get(893).getState());
	}

	@Test
	@DisplayName("Record 894: ZIP is 7305")
	void ZIPOfRecord894() {
		assertEquals("7305", customers.get(893).getZIP());
	}

	@Test
	@DisplayName("Record 894: Phone is 201-200-4966")
	void PhoneOfRecord894() {
		assertEquals("201-200-4966", customers.get(893).getPhone());
	}

	@Test
	@DisplayName("Record 894: Fax is 201-200-7767")
	void FaxOfRecord894() {
		assertEquals("201-200-7767", customers.get(893).getFax());
	}

	@Test
	@DisplayName("Record 894: Email is iona@burkhart.com")
	void EmailOfRecord894() {
		assertEquals("iona@burkhart.com", customers.get(893).getEmail());
	}

	@Test
	@DisplayName("Record 894: Web is http://www.ionaburkhart.com")
	void WebOfRecord894() {
		assertEquals("http://www.ionaburkhart.com", customers.get(893).getWeb());
	}
}
