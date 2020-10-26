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

@Tag("22")
class Record_4339 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4339: FirstName is Jaime")
	void FirstNameOfRecord4339() {
		assertEquals("Jaime", customers.get(4338).getFirstName());
	}

	@Test
	@DisplayName("Record 4339: LastName is Hajdukiewicz")
	void LastNameOfRecord4339() {
		assertEquals("Hajdukiewicz", customers.get(4338).getLastName());
	}

	@Test
	@DisplayName("Record 4339: Company is Boone, H C Cpa")
	void CompanyOfRecord4339() {
		assertEquals("Boone, H C Cpa", customers.get(4338).getCompany());
	}

	@Test
	@DisplayName("Record 4339: Address is 325 Princeton Ave")
	void AddressOfRecord4339() {
		assertEquals("325 Princeton Ave", customers.get(4338).getAddress());
	}

	@Test
	@DisplayName("Record 4339: City is Princeton")
	void CityOfRecord4339() {
		assertEquals("Princeton", customers.get(4338).getCity());
	}

	@Test
	@DisplayName("Record 4339: County is Mercer")
	void CountyOfRecord4339() {
		assertEquals("Mercer", customers.get(4338).getCounty());
	}

	@Test
	@DisplayName("Record 4339: State is NJ")
	void StateOfRecord4339() {
		assertEquals("NJ", customers.get(4338).getState());
	}

	@Test
	@DisplayName("Record 4339: ZIP is 8540")
	void ZIPOfRecord4339() {
		assertEquals("8540", customers.get(4338).getZIP());
	}

	@Test
	@DisplayName("Record 4339: Phone is 609-924-6646")
	void PhoneOfRecord4339() {
		assertEquals("609-924-6646", customers.get(4338).getPhone());
	}

	@Test
	@DisplayName("Record 4339: Fax is 609-924-8032")
	void FaxOfRecord4339() {
		assertEquals("609-924-8032", customers.get(4338).getFax());
	}

	@Test
	@DisplayName("Record 4339: Email is jaime@hajdukiewicz.com")
	void EmailOfRecord4339() {
		assertEquals("jaime@hajdukiewicz.com", customers.get(4338).getEmail());
	}

	@Test
	@DisplayName("Record 4339: Web is http://www.jaimehajdukiewicz.com")
	void WebOfRecord4339() {
		assertEquals("http://www.jaimehajdukiewicz.com", customers.get(4338).getWeb());
	}
}
