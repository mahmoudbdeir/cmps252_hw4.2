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

@Tag("4")
class Record_4633 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4633: FirstName is Kim")
	void FirstNameOfRecord4633() {
		assertEquals("Kim", customers.get(4632).getFirstName());
	}

	@Test
	@DisplayName("Record 4633: LastName is Ruisi")
	void LastNameOfRecord4633() {
		assertEquals("Ruisi", customers.get(4632).getLastName());
	}

	@Test
	@DisplayName("Record 4633: Company is Wolfson, Jack L Esq")
	void CompanyOfRecord4633() {
		assertEquals("Wolfson, Jack L Esq", customers.get(4632).getCompany());
	}

	@Test
	@DisplayName("Record 4633: Address is 9611 Pulaski Park Dr")
	void AddressOfRecord4633() {
		assertEquals("9611 Pulaski Park Dr", customers.get(4632).getAddress());
	}

	@Test
	@DisplayName("Record 4633: City is Middle River")
	void CityOfRecord4633() {
		assertEquals("Middle River", customers.get(4632).getCity());
	}

	@Test
	@DisplayName("Record 4633: County is Baltimore")
	void CountyOfRecord4633() {
		assertEquals("Baltimore", customers.get(4632).getCounty());
	}

	@Test
	@DisplayName("Record 4633: State is MD")
	void StateOfRecord4633() {
		assertEquals("MD", customers.get(4632).getState());
	}

	@Test
	@DisplayName("Record 4633: ZIP is 21220")
	void ZIPOfRecord4633() {
		assertEquals("21220", customers.get(4632).getZIP());
	}

	@Test
	@DisplayName("Record 4633: Phone is 410-780-7177")
	void PhoneOfRecord4633() {
		assertEquals("410-780-7177", customers.get(4632).getPhone());
	}

	@Test
	@DisplayName("Record 4633: Fax is 410-780-6295")
	void FaxOfRecord4633() {
		assertEquals("410-780-6295", customers.get(4632).getFax());
	}

	@Test
	@DisplayName("Record 4633: Email is kim@ruisi.com")
	void EmailOfRecord4633() {
		assertEquals("kim@ruisi.com", customers.get(4632).getEmail());
	}

	@Test
	@DisplayName("Record 4633: Web is http://www.kimruisi.com")
	void WebOfRecord4633() {
		assertEquals("http://www.kimruisi.com", customers.get(4632).getWeb());
	}
}
