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

@Tag("7")
class Record_520 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 520: FirstName is Beatrice")
	void FirstNameOfRecord520() {
		assertEquals("Beatrice", customers.get(519).getFirstName());
	}

	@Test
	@DisplayName("Record 520: LastName is Arevalos")
	void LastNameOfRecord520() {
		assertEquals("Arevalos", customers.get(519).getLastName());
	}

	@Test
	@DisplayName("Record 520: Company is Dodge Central Credit Union")
	void CompanyOfRecord520() {
		assertEquals("Dodge Central Credit Union", customers.get(519).getCompany());
	}

	@Test
	@DisplayName("Record 520: Address is 805 N Valley Mills Dr")
	void AddressOfRecord520() {
		assertEquals("805 N Valley Mills Dr", customers.get(519).getAddress());
	}

	@Test
	@DisplayName("Record 520: City is Waco")
	void CityOfRecord520() {
		assertEquals("Waco", customers.get(519).getCity());
	}

	@Test
	@DisplayName("Record 520: County is McLennan")
	void CountyOfRecord520() {
		assertEquals("McLennan", customers.get(519).getCounty());
	}

	@Test
	@DisplayName("Record 520: State is TX")
	void StateOfRecord520() {
		assertEquals("TX", customers.get(519).getState());
	}

	@Test
	@DisplayName("Record 520: ZIP is 76710")
	void ZIPOfRecord520() {
		assertEquals("76710", customers.get(519).getZIP());
	}

	@Test
	@DisplayName("Record 520: Phone is 254-776-2984")
	void PhoneOfRecord520() {
		assertEquals("254-776-2984", customers.get(519).getPhone());
	}

	@Test
	@DisplayName("Record 520: Fax is 254-776-9918")
	void FaxOfRecord520() {
		assertEquals("254-776-9918", customers.get(519).getFax());
	}

	@Test
	@DisplayName("Record 520: Email is beatrice@arevalos.com")
	void EmailOfRecord520() {
		assertEquals("beatrice@arevalos.com", customers.get(519).getEmail());
	}

	@Test
	@DisplayName("Record 520: Web is http://www.beatricearevalos.com")
	void WebOfRecord520() {
		assertEquals("http://www.beatricearevalos.com", customers.get(519).getWeb());
	}
}
