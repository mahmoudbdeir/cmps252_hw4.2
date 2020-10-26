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

@Tag("36")
class Record_3640 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3640: FirstName is Angel")
	void FirstNameOfRecord3640() {
		assertEquals("Angel", customers.get(3639).getFirstName());
	}

	@Test
	@DisplayName("Record 3640: LastName is Autovino")
	void LastNameOfRecord3640() {
		assertEquals("Autovino", customers.get(3639).getLastName());
	}

	@Test
	@DisplayName("Record 3640: Company is Hambright, James W Esq")
	void CompanyOfRecord3640() {
		assertEquals("Hambright, James W Esq", customers.get(3639).getCompany());
	}

	@Test
	@DisplayName("Record 3640: Address is 2200 Penfield Rd")
	void AddressOfRecord3640() {
		assertEquals("2200 Penfield Rd", customers.get(3639).getAddress());
	}

	@Test
	@DisplayName("Record 3640: City is Penfield")
	void CityOfRecord3640() {
		assertEquals("Penfield", customers.get(3639).getCity());
	}

	@Test
	@DisplayName("Record 3640: County is Monroe")
	void CountyOfRecord3640() {
		assertEquals("Monroe", customers.get(3639).getCounty());
	}

	@Test
	@DisplayName("Record 3640: State is NY")
	void StateOfRecord3640() {
		assertEquals("NY", customers.get(3639).getState());
	}

	@Test
	@DisplayName("Record 3640: ZIP is 14526")
	void ZIPOfRecord3640() {
		assertEquals("14526", customers.get(3639).getZIP());
	}

	@Test
	@DisplayName("Record 3640: Phone is 585-865-0811")
	void PhoneOfRecord3640() {
		assertEquals("585-865-0811", customers.get(3639).getPhone());
	}

	@Test
	@DisplayName("Record 3640: Fax is 585-865-4558")
	void FaxOfRecord3640() {
		assertEquals("585-865-4558", customers.get(3639).getFax());
	}

	@Test
	@DisplayName("Record 3640: Email is angel@autovino.com")
	void EmailOfRecord3640() {
		assertEquals("angel@autovino.com", customers.get(3639).getEmail());
	}

	@Test
	@DisplayName("Record 3640: Web is http://www.angelautovino.com")
	void WebOfRecord3640() {
		assertEquals("http://www.angelautovino.com", customers.get(3639).getWeb());
	}
}
