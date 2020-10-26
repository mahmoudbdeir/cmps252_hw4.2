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
class Record_4737 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4737: FirstName is Herschel")
	void FirstNameOfRecord4737() {
		assertEquals("Herschel", customers.get(4736).getFirstName());
	}

	@Test
	@DisplayName("Record 4737: LastName is Federer")
	void LastNameOfRecord4737() {
		assertEquals("Federer", customers.get(4736).getLastName());
	}

	@Test
	@DisplayName("Record 4737: Company is Markus Wholesale")
	void CompanyOfRecord4737() {
		assertEquals("Markus Wholesale", customers.get(4736).getCompany());
	}

	@Test
	@DisplayName("Record 4737: Address is 174 W Independence Blvd Bldg")
	void AddressOfRecord4737() {
		assertEquals("174 W Independence Blvd Bldg", customers.get(4736).getAddress());
	}

	@Test
	@DisplayName("Record 4737: City is Mount Airy")
	void CityOfRecord4737() {
		assertEquals("Mount Airy", customers.get(4736).getCity());
	}

	@Test
	@DisplayName("Record 4737: County is Surry")
	void CountyOfRecord4737() {
		assertEquals("Surry", customers.get(4736).getCounty());
	}

	@Test
	@DisplayName("Record 4737: State is NC")
	void StateOfRecord4737() {
		assertEquals("NC", customers.get(4736).getState());
	}

	@Test
	@DisplayName("Record 4737: ZIP is 27030")
	void ZIPOfRecord4737() {
		assertEquals("27030", customers.get(4736).getZIP());
	}

	@Test
	@DisplayName("Record 4737: Phone is 336-786-5011")
	void PhoneOfRecord4737() {
		assertEquals("336-786-5011", customers.get(4736).getPhone());
	}

	@Test
	@DisplayName("Record 4737: Fax is 336-786-8658")
	void FaxOfRecord4737() {
		assertEquals("336-786-8658", customers.get(4736).getFax());
	}

	@Test
	@DisplayName("Record 4737: Email is herschel@federer.com")
	void EmailOfRecord4737() {
		assertEquals("herschel@federer.com", customers.get(4736).getEmail());
	}

	@Test
	@DisplayName("Record 4737: Web is http://www.herschelfederer.com")
	void WebOfRecord4737() {
		assertEquals("http://www.herschelfederer.com", customers.get(4736).getWeb());
	}
}
