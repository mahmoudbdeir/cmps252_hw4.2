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

@Tag("32")
class Record_4862 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4862: FirstName is Jamaal")
	void FirstNameOfRecord4862() {
		assertEquals("Jamaal", customers.get(4861).getFirstName());
	}

	@Test
	@DisplayName("Record 4862: LastName is Bosio")
	void LastNameOfRecord4862() {
		assertEquals("Bosio", customers.get(4861).getLastName());
	}

	@Test
	@DisplayName("Record 4862: Company is Hyde, Carol A Esq")
	void CompanyOfRecord4862() {
		assertEquals("Hyde, Carol A Esq", customers.get(4861).getCompany());
	}

	@Test
	@DisplayName("Record 4862: Address is 634 Court St")
	void AddressOfRecord4862() {
		assertEquals("634 Court St", customers.get(4861).getAddress());
	}

	@Test
	@DisplayName("Record 4862: City is Jacksonville")
	void CityOfRecord4862() {
		assertEquals("Jacksonville", customers.get(4861).getCity());
	}

	@Test
	@DisplayName("Record 4862: County is Onslow")
	void CountyOfRecord4862() {
		assertEquals("Onslow", customers.get(4861).getCounty());
	}

	@Test
	@DisplayName("Record 4862: State is NC")
	void StateOfRecord4862() {
		assertEquals("NC", customers.get(4861).getState());
	}

	@Test
	@DisplayName("Record 4862: ZIP is 28540")
	void ZIPOfRecord4862() {
		assertEquals("28540", customers.get(4861).getZIP());
	}

	@Test
	@DisplayName("Record 4862: Phone is 910-455-4086")
	void PhoneOfRecord4862() {
		assertEquals("910-455-4086", customers.get(4861).getPhone());
	}

	@Test
	@DisplayName("Record 4862: Fax is 910-455-2644")
	void FaxOfRecord4862() {
		assertEquals("910-455-2644", customers.get(4861).getFax());
	}

	@Test
	@DisplayName("Record 4862: Email is jamaal@bosio.com")
	void EmailOfRecord4862() {
		assertEquals("jamaal@bosio.com", customers.get(4861).getEmail());
	}

	@Test
	@DisplayName("Record 4862: Web is http://www.jamaalbosio.com")
	void WebOfRecord4862() {
		assertEquals("http://www.jamaalbosio.com", customers.get(4861).getWeb());
	}
}
