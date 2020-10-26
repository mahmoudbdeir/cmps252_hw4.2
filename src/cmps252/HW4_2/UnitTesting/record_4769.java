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

@Tag("12")
class Record_4769 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4769: FirstName is Angelia")
	void FirstNameOfRecord4769() {
		assertEquals("Angelia", customers.get(4768).getFirstName());
	}

	@Test
	@DisplayName("Record 4769: LastName is Scampoli")
	void LastNameOfRecord4769() {
		assertEquals("Scampoli", customers.get(4768).getLastName());
	}

	@Test
	@DisplayName("Record 4769: Company is W M Moyer Co")
	void CompanyOfRecord4769() {
		assertEquals("W M Moyer Co", customers.get(4768).getCompany());
	}

	@Test
	@DisplayName("Record 4769: Address is 1107 Kenilworth Dr")
	void AddressOfRecord4769() {
		assertEquals("1107 Kenilworth Dr", customers.get(4768).getAddress());
	}

	@Test
	@DisplayName("Record 4769: City is Towson")
	void CityOfRecord4769() {
		assertEquals("Towson", customers.get(4768).getCity());
	}

	@Test
	@DisplayName("Record 4769: County is Baltimore")
	void CountyOfRecord4769() {
		assertEquals("Baltimore", customers.get(4768).getCounty());
	}

	@Test
	@DisplayName("Record 4769: State is MD")
	void StateOfRecord4769() {
		assertEquals("MD", customers.get(4768).getState());
	}

	@Test
	@DisplayName("Record 4769: ZIP is 21204")
	void ZIPOfRecord4769() {
		assertEquals("21204", customers.get(4768).getZIP());
	}

	@Test
	@DisplayName("Record 4769: Phone is 410-821-6217")
	void PhoneOfRecord4769() {
		assertEquals("410-821-6217", customers.get(4768).getPhone());
	}

	@Test
	@DisplayName("Record 4769: Fax is 410-821-4466")
	void FaxOfRecord4769() {
		assertEquals("410-821-4466", customers.get(4768).getFax());
	}

	@Test
	@DisplayName("Record 4769: Email is angelia@scampoli.com")
	void EmailOfRecord4769() {
		assertEquals("angelia@scampoli.com", customers.get(4768).getEmail());
	}

	@Test
	@DisplayName("Record 4769: Web is http://www.angeliascampoli.com")
	void WebOfRecord4769() {
		assertEquals("http://www.angeliascampoli.com", customers.get(4768).getWeb());
	}
}
