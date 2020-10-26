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

@Tag("5")
class Record_3914 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3914: FirstName is Lino")
	void FirstNameOfRecord3914() {
		assertEquals("Lino", customers.get(3913).getFirstName());
	}

	@Test
	@DisplayName("Record 3914: LastName is Holberg")
	void LastNameOfRecord3914() {
		assertEquals("Holberg", customers.get(3913).getLastName());
	}

	@Test
	@DisplayName("Record 3914: Company is Johnson, Geraldine M Esq")
	void CompanyOfRecord3914() {
		assertEquals("Johnson, Geraldine M Esq", customers.get(3913).getCompany());
	}

	@Test
	@DisplayName("Record 3914: Address is 118 E King St")
	void AddressOfRecord3914() {
		assertEquals("118 E King St", customers.get(3913).getAddress());
	}

	@Test
	@DisplayName("Record 3914: City is Lancaster")
	void CityOfRecord3914() {
		assertEquals("Lancaster", customers.get(3913).getCity());
	}

	@Test
	@DisplayName("Record 3914: County is Lancaster")
	void CountyOfRecord3914() {
		assertEquals("Lancaster", customers.get(3913).getCounty());
	}

	@Test
	@DisplayName("Record 3914: State is PA")
	void StateOfRecord3914() {
		assertEquals("PA", customers.get(3913).getState());
	}

	@Test
	@DisplayName("Record 3914: ZIP is 17602")
	void ZIPOfRecord3914() {
		assertEquals("17602", customers.get(3913).getZIP());
	}

	@Test
	@DisplayName("Record 3914: Phone is 717-299-7061")
	void PhoneOfRecord3914() {
		assertEquals("717-299-7061", customers.get(3913).getPhone());
	}

	@Test
	@DisplayName("Record 3914: Fax is 717-299-5786")
	void FaxOfRecord3914() {
		assertEquals("717-299-5786", customers.get(3913).getFax());
	}

	@Test
	@DisplayName("Record 3914: Email is lino@holberg.com")
	void EmailOfRecord3914() {
		assertEquals("lino@holberg.com", customers.get(3913).getEmail());
	}

	@Test
	@DisplayName("Record 3914: Web is http://www.linoholberg.com")
	void WebOfRecord3914() {
		assertEquals("http://www.linoholberg.com", customers.get(3913).getWeb());
	}
}
