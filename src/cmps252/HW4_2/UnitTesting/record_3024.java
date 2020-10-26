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
class Record_3024 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3024: FirstName is Maryellen")
	void FirstNameOfRecord3024() {
		assertEquals("Maryellen", customers.get(3023).getFirstName());
	}

	@Test
	@DisplayName("Record 3024: LastName is Ebbesen")
	void LastNameOfRecord3024() {
		assertEquals("Ebbesen", customers.get(3023).getLastName());
	}

	@Test
	@DisplayName("Record 3024: Company is Lieberman, Bernard Esq")
	void CompanyOfRecord3024() {
		assertEquals("Lieberman, Bernard Esq", customers.get(3023).getCompany());
	}

	@Test
	@DisplayName("Record 3024: Address is 5712 N Teutonia Ave")
	void AddressOfRecord3024() {
		assertEquals("5712 N Teutonia Ave", customers.get(3023).getAddress());
	}

	@Test
	@DisplayName("Record 3024: City is Milwaukee")
	void CityOfRecord3024() {
		assertEquals("Milwaukee", customers.get(3023).getCity());
	}

	@Test
	@DisplayName("Record 3024: County is Milwaukee")
	void CountyOfRecord3024() {
		assertEquals("Milwaukee", customers.get(3023).getCounty());
	}

	@Test
	@DisplayName("Record 3024: State is WI")
	void StateOfRecord3024() {
		assertEquals("WI", customers.get(3023).getState());
	}

	@Test
	@DisplayName("Record 3024: ZIP is 53209")
	void ZIPOfRecord3024() {
		assertEquals("53209", customers.get(3023).getZIP());
	}

	@Test
	@DisplayName("Record 3024: Phone is 414-352-6764")
	void PhoneOfRecord3024() {
		assertEquals("414-352-6764", customers.get(3023).getPhone());
	}

	@Test
	@DisplayName("Record 3024: Fax is 414-352-3261")
	void FaxOfRecord3024() {
		assertEquals("414-352-3261", customers.get(3023).getFax());
	}

	@Test
	@DisplayName("Record 3024: Email is maryellen@ebbesen.com")
	void EmailOfRecord3024() {
		assertEquals("maryellen@ebbesen.com", customers.get(3023).getEmail());
	}

	@Test
	@DisplayName("Record 3024: Web is http://www.maryellenebbesen.com")
	void WebOfRecord3024() {
		assertEquals("http://www.maryellenebbesen.com", customers.get(3023).getWeb());
	}
}
