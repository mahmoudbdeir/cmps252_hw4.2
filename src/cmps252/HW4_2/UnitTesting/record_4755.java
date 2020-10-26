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

@Tag("8")
class Record_4755 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4755: FirstName is Kenton")
	void FirstNameOfRecord4755() {
		assertEquals("Kenton", customers.get(4754).getFirstName());
	}

	@Test
	@DisplayName("Record 4755: LastName is Kosloski")
	void LastNameOfRecord4755() {
		assertEquals("Kosloski", customers.get(4754).getLastName());
	}

	@Test
	@DisplayName("Record 4755: Company is Rosen, William M Esq")
	void CompanyOfRecord4755() {
		assertEquals("Rosen, William M Esq", customers.get(4754).getCompany());
	}

	@Test
	@DisplayName("Record 4755: Address is 696 E Arlington Blvd")
	void AddressOfRecord4755() {
		assertEquals("696 E Arlington Blvd", customers.get(4754).getAddress());
	}

	@Test
	@DisplayName("Record 4755: City is Greenville")
	void CityOfRecord4755() {
		assertEquals("Greenville", customers.get(4754).getCity());
	}

	@Test
	@DisplayName("Record 4755: County is Pitt")
	void CountyOfRecord4755() {
		assertEquals("Pitt", customers.get(4754).getCounty());
	}

	@Test
	@DisplayName("Record 4755: State is NC")
	void StateOfRecord4755() {
		assertEquals("NC", customers.get(4754).getState());
	}

	@Test
	@DisplayName("Record 4755: ZIP is 27858")
	void ZIPOfRecord4755() {
		assertEquals("27858", customers.get(4754).getZIP());
	}

	@Test
	@DisplayName("Record 4755: Phone is 252-756-4261")
	void PhoneOfRecord4755() {
		assertEquals("252-756-4261", customers.get(4754).getPhone());
	}

	@Test
	@DisplayName("Record 4755: Fax is 252-756-6238")
	void FaxOfRecord4755() {
		assertEquals("252-756-6238", customers.get(4754).getFax());
	}

	@Test
	@DisplayName("Record 4755: Email is kenton@kosloski.com")
	void EmailOfRecord4755() {
		assertEquals("kenton@kosloski.com", customers.get(4754).getEmail());
	}

	@Test
	@DisplayName("Record 4755: Web is http://www.kentonkosloski.com")
	void WebOfRecord4755() {
		assertEquals("http://www.kentonkosloski.com", customers.get(4754).getWeb());
	}
}
